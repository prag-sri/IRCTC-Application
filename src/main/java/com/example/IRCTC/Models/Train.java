package com.example.IRCTC.Models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainNo;

    private String source;

    private String destination;

    @OneToMany(mappedBy = "train",cascade = CascadeType.ALL)
    private List<Passenger> passengersList;

    public Train() {
    }

    public Train(String source, String destination) {
        this.source = source;
        this.destination = destination;
        this.passengersList= new ArrayList<>();
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Passenger> getPassengersList() {
        return passengersList;
    }

    public void setPassengersList(List<Passenger> passengersList) {
        this.passengersList = passengersList;
    }
}

//Create an IRCTC system , Train = TrainNo ,Source ,Destination
// Passenger = TicketId ,TrainId ,Date.,Age,gender FoodOrder = TicketId,TrainId ,price
// POST API - Add a Passenger with ticketId , trainId ,Date,age,gender
// POST API - Add a Train with trainNo , source ,destination .
