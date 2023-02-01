package com.example.IRCTC.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketId;

    @CreationTimestamp
    private Date date;

    private int age;

    @Enumerated(value = EnumType.STRING)
    private Gender gender;

    //trainId
    @ManyToOne
    @JoinColumn
    private Train train;

    public Passenger() {
    }

    public Passenger(int age, Gender gender) {
        this.date = new Date();
        this.age = age;
        this.gender = gender;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}

//Create an IRCTC system , Train = TrainNo ,Source ,Destination
// Passenger = TicketId ,TrainId ,Date.,Age,gender FoodOrder = TicketId,TrainId ,price
// POST API - Add a Passenger with ticketId , trainId ,Date,age,gender
// POST API - Add a Train with trainNo , source ,destination .