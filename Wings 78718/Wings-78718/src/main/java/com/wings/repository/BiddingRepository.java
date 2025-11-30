package com.wings.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wings.model.BiddingModel;

public interface BiddingRepository extends JpaRepository<BiddingModel, Integer> {

}
