package com.example.IRCTC.Services;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import com.example.IRCTC.Repositories.TrainRepo;
import com.example.IRCTC.RequestDTOs.PassengerRequestDTO;
import com.example.IRCTC.RequestDTOs.TrainRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TrainService {

    @Autowired
    TrainRepo trainRepo;

    public void addTrain(@RequestBody TrainRequestDTO trainRequestDTO)
    {
        Train train= new Train(trainRequestDTO.getSource(), trainRequestDTO.getDestination());
        trainRepo.save(train);
    }
}
