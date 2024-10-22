package com.example.bookmyshowoct24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
    private String seatNumber;
    private int rowNumber;
    private int colNumber;
    private SeatType seatType;
}
