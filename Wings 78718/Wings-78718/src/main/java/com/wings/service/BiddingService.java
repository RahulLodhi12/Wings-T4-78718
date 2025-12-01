package com.wings.service;

import org.springframework.http.ResponseEntity;

import com.wings.model.BiddingModel;
import com.wings.repository.BiddingRepository;

public class BiddingService {
	private BiddingRepository biddingRepository;
	
	private UserService userService;
	
	public ResponseEntity<Object> postBidding(BiddingModel biddingModel){
		return null;
	}
	
	
	public ResponseEntity<Object> getBidding(double bidAmount){
		return null;
	}
	
	public ResponseEntity<Object> updateBidding(int id, BiddingModel model){
		return null;
	}
	
	public ResponseEntity<Object> deleteBidding(int id){
		return null;
	}
}

