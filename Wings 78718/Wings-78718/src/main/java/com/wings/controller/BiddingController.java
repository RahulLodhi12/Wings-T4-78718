package com.wings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wings.model.BiddingModel;
import com.wings.service.BiddingService;

@RestController
@RequestMapping("/bidding")
public class BiddingController {
	@Autowired
	private BiddingService biddingService;
	
	@PostMapping("/add")
	public ResponseEntity<Object> postBidding(BiddingModel biddingModel){
		return null;
	}
	
	@GetMapping("/list")
	public ResponseEntity<Object> getBidding(double bidAmount){
		return null;
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<Object> updateBidding(int id, BiddingModel biddingModel){
		return null;
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteBidding(int id){
		return null;
	}
}
