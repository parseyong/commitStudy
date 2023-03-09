package config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {

	@Override // 핸들러 매핑을 하기위한 설정 
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override //뷰 이름을 실제 뷰객체로 변환하는데 사용
	//즉, 컨트롤러에서 반환된 뷰 이름을 기반으로 어떤 뷰 객체를 사용할지를 결정하는 데 필요한 객체
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp("/WEB-INF/view/", ".jsp");
	}

	@Override//뷰 컨트롤러는 컨트롤러와 달리 모델 데이터를 반환하지 않고, 단순히 뷰 이름만 반환합니다.
	//예를 들어, "home"이라는 뷰 이름을 반환하면, 스프링 MVC는 "home"이라는 이름의 뷰를 찾아서 클라이언트에게 반환합니다.
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/main").setViewName("main"); // /main경로로 요청이 들어오면  main뷰 반환
	}

}