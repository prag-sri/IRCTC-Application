package com.example.IRCTC.Controllers;

import com.example.IRCTC.RequestDTOs.PassengerRequestDTO;
import com.example.IRCTC.Services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @PostMapping("/add_passenger")
    public ResponseEntity<String> addPassenger(@RequestBody PassengerRequestDTO passengerRequestDTO)
    {
        passengerService.addPassenger(passengerRequestDTO);
        return new ResponseEntity<>("New passenger added successfully!", HttpStatus.CREATED);
    }
}

//POST API - Add a Passenger with ticketId , trainId ,Date,age,gender
