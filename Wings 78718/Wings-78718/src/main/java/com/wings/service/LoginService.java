package com.wings.service;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wings.model.UserModel;

public class LoginService implements UserDetailsService{

	private UserService userService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return null;
	}
	
	private UserDetails buildUserForAuthentication(UserModel user, List<GrantedAuthority> authorties) {
		return null;
	}
	
	private List<GrantedAuthority> buildUserAuthority(String userRole){
		return null;
	}
}
