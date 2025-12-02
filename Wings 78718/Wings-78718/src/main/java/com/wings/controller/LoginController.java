package com.wings.controller;


import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.PostMapping;

import com.wings.dto.LoginDTO;
import com.wings.security.JWTUtil;
import com.wings.service.LoginService;


public class LoginController {

    /*
         This controller would be responsible for the login endpoints
         Add the required annotations and create the endpoints
    */

    private AuthenticationManager authenticationManager;

    LoginService loginService;

    private JWTUtil jwtTokenUtil;

    @PostMapping("/login")
    public Object authenticateUser( LoginDTO authenticationRequest) throws Exception {

        return null;
    }


}