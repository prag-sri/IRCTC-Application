package com.example.IRCTC.Controllers;

import com.example.IRCTC.RequestDTOs.PassengerRequestDTO;
import com.example.IRCTC.RequestDTOs.TrainRequestDTO;
import com.example.IRCTC.Services.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainController {

    @Autowired
    TrainService trainService;

    @PostMapping("/add_train")
    public ResponseEntity<String> addTrain(@RequestBody TrainRequestDTO trainRequestDTO)
    {
        trainService.addTrain(trainRequestDTO);
        return new ResponseEntity<>("New train added successfully!", HttpStatus.CREATED);
    }
}
