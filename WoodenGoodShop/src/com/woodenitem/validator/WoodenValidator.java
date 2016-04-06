package com.woodenitem.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.woodenitem.bean.WoodenItemBean;

public class WoodenValidator implements Validator {

	@Override
	public boolean supports(Class<?> c) {
		return WoodenItemBean.class.isAssignableFrom(c);
	}

	@Override
	public void validate(Object command, Errors errors) {
		WoodenItemBean regBean = (WoodenItemBean)command;
		/*if(!regBean.getPassword().equals(regBean.getRePassword()))
			errors.rejectValue("rePassword","password.notmatch");*/
	}

}
