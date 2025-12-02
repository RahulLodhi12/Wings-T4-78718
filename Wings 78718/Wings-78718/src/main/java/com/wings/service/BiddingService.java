package com.wings.service;


import org.springframework.http.ResponseEntity;

import com.wings.model.BiddingModel;
import com.wings.repository.BiddingRepository;


public class BiddingService {

     /*
   Implement the business logic for the BiddingService  operations in this class
   Make sure to add required annotations
    */


    private BiddingRepository biddingRepository;


    private UserService userService;


    //to add the Bidding using BiddingModel object
    //created->201
    //badRequest->400
    public ResponseEntity<Object> postBidding(BiddingModel biddingModel) {
        return null;
    }


    //to get the bidding details  which are greater than the given bidAmount
    //ok()->200
    //badRequest()->400
    public ResponseEntity<Object> getBidding(double bidAmount) {
        return null;
    }


    //to update the bidding status
    //ok->200
    //badRequest->400
    public ResponseEntity<Object> updateBidding(int id, BiddingModel model) {
        return null;
    }

    //to delete the Bidding by using id
    //approver and only the creater of that particular Bidding can delete
    //noContent->204
    //badRequest->400
    //forbidden->403
    public ResponseEntity<Object> deleteBidding(int id) {
        return null;
    }

}