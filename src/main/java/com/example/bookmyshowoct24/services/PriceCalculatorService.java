package com.example.bookmyshowoct24.services;

import com.example.bookmyshowoct24.models.ShowSeat;
import com.example.bookmyshowoct24.models.ShowSeatType;
import com.example.bookmyshowoct24.repositories.ShowSeatTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceCalculatorService {
    private ShowSeatTypeRepository showSeatTypeRepository;

    public PriceCalculatorService(ShowSeatTypeRepository showSeatTypeRepository) {
        this.showSeatTypeRepository = showSeatTypeRepository;
    }


    public int calculatePrice(List<ShowSeat> showSeats) {
        int amount = 0;

        List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findAllByShow(showSeats.get(0).getShow());
        /*
            123 GOLD 500
            123 SILVER 300
            123 PLATINUM 700
            123 RECLINER 800
         */

        for (ShowSeat showSeat : showSeats) { // A1, A2, B1
            for (ShowSeatType showSeatType : showSeatTypes) {
                if (showSeat.getSeat().getSeatType().equals(showSeatType.getSeatType())) {
                    amount += showSeatType.getPrice();
                    break;
                }
            }
        }

        return amount;
    }
}
