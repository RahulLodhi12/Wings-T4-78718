package com.wings.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wings.model.BiddingModel;
import com.wings.service.BiddingService;

@RestController
@RequestMapping("/bidding")
public class BiddingController {

     /*
  This controller would be responsible for the BiddingController endpoints
  Add the required annotations and create the endpoints
   */

	@Autowired
    private BiddingService biddingService;

    //to create a bidding using biddingModel object
    @PostMapping("/add")
    public ResponseEntity<Object> postBidding(@RequestBody BiddingModel biddingModel){
//        return null;
    	return biddingService.postBidding(biddingModel);
    }

    //to get the bidding which are greater than the given bidAmount
    @GetMapping("/list")
    public ResponseEntity<Object> getBidding( double bidAmount){
        return null;
    }

    //to update the bidding by id as PathVariable and bidding Object
    @PatchMapping("/update/{id}")
    public ResponseEntity<Object> updateBidding( int id,BiddingModel biddingModel){
        return null;
    }

    // to delete the bidding by using id as PathVariable
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> deleteBidding( int id){
        return null;
    }

}