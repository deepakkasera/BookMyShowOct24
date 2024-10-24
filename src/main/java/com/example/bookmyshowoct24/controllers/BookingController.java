package com.example.bookmyshowoct24.controllers;

import com.example.bookmyshowoct24.dtos.CreateBookingRequestDto;
import com.example.bookmyshowoct24.dtos.CreateBookingResponseDto;
import com.example.bookmyshowoct24.models.Booking;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @PostMapping
    public CreateBookingResponseDto createBooking(@RequestBody CreateBookingRequestDto requestDto) {
        return null;
    }
}
