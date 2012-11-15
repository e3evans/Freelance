package com.mlb.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mlb.common.form.RegistrationForm;

@Controller
@RequestMapping("/mlb")
public class RegistrationController {

	@RequestMapping("/register")
	public ModelAndView register(ModelMap model){
		
		return new ModelAndView("registration","command",new RegistrationForm());
	}
	
	@RequestMapping(value="/submitRegistration",method=RequestMethod.POST)
	public ModelAndView submitRegistration(@ModelAttribute("registration")
			RegistrationForm registration,BindingResult result){
		
		System.out.println(registration.getFirstname());
		
		return new ModelAndView("registration","command",registration);
	}
}
