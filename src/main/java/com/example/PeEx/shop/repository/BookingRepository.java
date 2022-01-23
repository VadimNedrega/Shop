package com.example.PeEx.shop.repository;

import com.example.PeEx.shop.domain.Booking;
import com.example.PeEx.shop.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {

}
