package com.jolocom.webidproxy.email;

import com.jolocom.webidproxy.users.User;

public class RegisterEmail extends Email {

	public RegisterEmail(User user, String to) {

		super(user, to, "/email-register.vm");
	}
}
