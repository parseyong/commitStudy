package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import spring.RegisterRequest;


public class RegisterRequestValidator implements Validator{
	
	public boolean isNumberic(String str) {
		return Pattern.matches("^[0-9]*$", str);
	}
	
	@Override
	public boolean supports(Class<?> clazz) {
		return RegisterRequest.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RegisterRequest regReq = (RegisterRequest) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"email","email.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"password","password.empty");
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors,"confirmPassword","Confirmpassword.empty");;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"name","name.empty");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors,"id","id.empty");
		
		if(!regReq.isPasswordEqualToConfirmPassword()) {
			errors.rejectValue("confirmPassword","password.notEqualPassword");
		}
		
		if(!isNumberic(regReq.getId())) {
			errors.rejectValue("id","id.notLong");
		}
		
	}
}
