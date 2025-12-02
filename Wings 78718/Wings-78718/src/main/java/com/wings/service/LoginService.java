package com.wings.service;




import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.wings.model.UserModel;

public class LoginService implements UserDetailsService {

      /*
   Implement the business logic for the LoginService  operations in this class
   Make sure to add required annotations
    */


    private UserService userService;


    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return null;
    }

    private UserDetails buildUserForAuthentication(UserModel user, List<GrantedAuthority> authorities) {
        return null;
    }

    private List<GrantedAuthority> buildUserAuthority(String userRole) {
        return null;
    }

}