package com.example.bookmyshowoct24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    private List<Feature> features;
}


// Theatre ----- Screen -> 1:M

//Show ---- Movie -> M:1

//  1          1
//Show ----- Screen => M:1
//  M           1