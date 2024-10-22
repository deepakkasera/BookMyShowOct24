package com.example.bookmyshowoct24.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Theatre extends BaseModel {
    private String name;
    private String address;

    @OneToMany
    private List<Screen> screens;
}

/*

Theatre ---- Screen

 */
