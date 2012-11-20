package com.mlb.common.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mlb.common.form.RegistrationForm;
import com.mlb.common.form.UserForm;
import com.mlb.common.utils.Digest;
import com.mlb.services.RoleService;

@Controller
@RequestMapping("/mlb")
public class RegistrationController {
	
	private String hashKey = "R3gU$sR2@1l";

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView getUserName(ModelMap model){
		
		
		return new ModelAndView("username","userIDForm",new UserForm());
	}
	
	@RequestMapping("/register")
	public ModelAndView register(ModelMap model){
		model.put("roleList", RoleService.getRoleData());
		
		Digest d = new Digest(hashKey);
		d.digest(hashKey);
		
		
		return new ModelAndView("registration","registrationForm",new RegistrationForm());
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/submitRegistration",method=RequestMethod.POST)
	public String submitRegistration(@Valid RegistrationForm registration,
			BindingResult result,Map model){
		model.put("roleList", RoleService.getRoleData());
		System.out.println(registration.getFirstname());
		System.out.println(result.hasErrors());
		if (result.hasErrors())return "registration";
		model.put("registration", registration);
		return "registration";
	}
	
	
	
}
