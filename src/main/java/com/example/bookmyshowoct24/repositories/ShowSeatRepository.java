package com.example.bookmyshowoct24.repositories;

import com.example.bookmyshowoct24.models.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

    //select * from show_seats where id IN (1, 4, 5, 7, 19, .......)
    List<ShowSeat> findAllById(List<Long> showSeatIds);

    ShowSeat save(ShowSeat showSeat);
}
