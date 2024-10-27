package com.example.bookmyshowoct24.controllers;

import com.example.bookmyshowoct24.dtos.CreateBookingRequestDto;
import com.example.bookmyshowoct24.dtos.CreateBookingResponseDto;
import com.example.bookmyshowoct24.dtos.ResponseStatus;
import com.example.bookmyshowoct24.exceptions.ShowSeatNotFoundException;
import com.example.bookmyshowoct24.exceptions.UserNotFoundException;
import com.example.bookmyshowoct24.models.Booking;
import com.example.bookmyshowoct24.services.BookingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    private BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public CreateBookingResponseDto createBooking(@RequestBody CreateBookingRequestDto requestDto) throws UserNotFoundException, ShowSeatNotFoundException {
        CreateBookingResponseDto responseDto = new CreateBookingResponseDto();
        Booking booking = null;

        booking = bookingService.createBooking(
                requestDto.getShowSeatIds(),
                requestDto.getUserId()
        );

        responseDto.setBooking(booking);
        responseDto.setResponseStatus(ResponseStatus.SUCCESS);

        if (booking == null) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }
}
