package com.example.bookmyshowoct24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Screen extends BaseModel {
    private String name;

    @OneToMany
    private List<Seat> seats;

    private List<Feature> features;
    //private Theatre theatre;
}

/*

  1          M
Screen ---- Seat => 1:M
  1          1

 */
