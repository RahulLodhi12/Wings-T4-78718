package com.wings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wings.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer>{

}
