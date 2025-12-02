package com.wings.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wings.model.UserModel;
import com.wings.repository.RoleRepository;
import com.wings.repository.UserRepository;

@Service
public class UserService {

      /*
   Implement the business logic for the UserService  operations in this class
   Make sure to add required annotations
    */

	@Autowired
    private UserRepository userRepository;

	@Autowired
    private RoleRepository roleRepository;


    //get user by email
    public UserModel getUserByEmail(String email){
        return null;
    }
}