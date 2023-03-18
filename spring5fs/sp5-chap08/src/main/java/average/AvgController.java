package average;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AvgController {
	
	@RequestMapping("/average/takingInput")
	public String handleAvg1(Model model) {
		model.addAttribute(new TestScore());
		return "average/takingInput";
	}
	
	@PostMapping("/average/calculateAvg")
	public String handleAvg2(TestScore score,Model model) {
		score.setAvg(calcAvg(score));
		model.addAttribute("score",score);
		return "average/calculateAvg";
	}
	
	private double calcAvg(TestScore score) {
		double sum=score.getEnglish()+score.getKorean()+score.getMath()+score.getScience();
		double avg=sum/4+sum%4;
		return avg;
	}
	
	
	
}
