package com.example.IRCTC.RequestDTOs;

import com.example.IRCTC.Models.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

public class PassengerRequestDTO {
    private int age;

    private Gender gender;

    private int trainId;

    public PassengerRequestDTO() {
    }

    public PassengerRequestDTO(int age, Gender gender, int trainId) {
        this.age = age;
        this.gender = gender;
        this.trainId = trainId;
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

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }
}
