package com.wings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wings.dto.LoginDTO;
import com.wings.security.JWTUtil;
import com.wings.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	LoginService loginService;
	
	@Autowired
	private JWTUtil jwtTokJwtUtil;
	
	@PostMapping("/login")
	public Object authenticateUser(LoginDTO authenticationRequest) throws Exception{
		return null;
	}
}
