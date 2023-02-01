package com.example.IRCTC.Services;

import com.example.IRCTC.Models.Passenger;
import com.example.IRCTC.Models.Train;
import com.example.IRCTC.Repositories.PassengerRepo;
import com.example.IRCTC.Repositories.TrainRepo;
import com.example.IRCTC.RequestDTOs.PassengerRequestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class PassengerService {

    @Autowired
    PassengerRepo passengerRepo;

    @Autowired
    TrainRepo trainRepo;

    public void addPassenger(@RequestBody PassengerRequestDTO passengerRequestDTO)
    {
        Passenger passenger= new Passenger(passengerRequestDTO.getAge(),passengerRequestDTO.getGender());
        Train train= trainRepo.findById(passengerRequestDTO.getTrainId()).get();
        passenger.setTrain(train);

        List<Passenger> passengers= train.getPassengersList();
        passengers.add(passenger);
        trainRepo.save(train);
//        passengerRepo.save(passenger);
    }
}
