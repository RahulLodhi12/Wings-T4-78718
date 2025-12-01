package com.wings.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.wings.service.LoginService;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	private LoginService loginService;
	
	private AuthenticationFilter authFilter;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.userDetailsService(loginService);
	}
	
	@Override
	public void configure(WebSecurity web) throws Exception{
		web.ignoring().antMatchers("/h2-console/**")
		.antMatchers("/login");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return null;
	}
	
	@Override
	@Bean
	protected AuthenticationManager authenticationManager() throws Exception{
		return super.authenticationManager();
	}
}
