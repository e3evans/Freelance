package com.mlb.common.form;

import org.hibernate.validator.constraints.NotEmpty;

public class UserForm {
	
	@NotEmpty(message="User ID cannot be blank.")
	private String user_id;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	

}
