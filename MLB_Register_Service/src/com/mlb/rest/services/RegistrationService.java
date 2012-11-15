package com.mlb.rest.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mlb.data.beans.User;

@Path("/registerTest")
public class RegistrationService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getUserJSON(){
		User user = new User();
		user.setFirstname("Eric");
		user.setLastname("Evans");
		
		return user.toString();
		
	}
	
}
