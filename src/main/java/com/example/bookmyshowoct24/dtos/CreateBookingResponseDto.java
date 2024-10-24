package com.example.bookmyshowoct24.dtos;

import com.example.bookmyshowoct24.models.Booking;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBookingResponseDto {
    private Booking booking;
    private ResponseStatus responseStatus;
}
