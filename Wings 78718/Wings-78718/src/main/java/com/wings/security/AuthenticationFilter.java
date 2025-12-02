package com.wings.security;



import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import com.wings.service.LoginService;


public class AuthenticationFilter extends OncePerRequestFilter {

   /*
   AuthenticationFilter Can be used to filter the incoming requests
    */

    private JWTUtil jWTUtil;

    private LoginService loginService;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        /*
        Filter the incoming request, and verify the request meets the security criteria
         */

    }
}