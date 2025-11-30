package com.wings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wings.model.RoleModel;

public interface RoleRepository extends JpaRepository<RoleModel, Integer> {

}
