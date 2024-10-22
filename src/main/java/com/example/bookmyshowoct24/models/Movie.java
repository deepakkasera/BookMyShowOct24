package com.example.bookmyshowoct24.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String movie;
    // private List<Actor> cast;
    private double rating;
}
