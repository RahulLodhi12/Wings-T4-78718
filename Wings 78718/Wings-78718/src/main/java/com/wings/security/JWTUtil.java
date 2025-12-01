package com.wings.security;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.wings.service.UserService;

import io.jsonwebtoken.Claims;

@Component
public class JWTUtil implements Serializable{
	private static final long serialVersionUID = 654352132132L;
	private static final long JWT_TOKEN_VALIDITY = 500*60*60;
	private final String secretKey = "randomkey123";
	
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token,Claims::getSubject);
	}
	
	public Date getExpiratonDateFromToken(String token) {
		return getClaimFromToken(token,Claims::getExpiration);
	}

	public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
		return null;
	}
	
	private Claims getAllClaimsFromToken(String token) {
		return null;
	}
	
	private Boolean isTokenExpired(String token) {
		return null;
	}
	
	UserService userService;
	
	public String generateToken(UserDetails userDetails) {
		return null;
	}
	
	private String doGenerateToken(Map<String,Object> claims, String subject) {
		return null;
	}
	
	public Boolean validateToken(String token, UserDetails userDetails) {
		return null;
	}
}
