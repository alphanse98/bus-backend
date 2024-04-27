package com.example.billingbackend.service;

import com.example.billingbackend.entity.BookingEntity;

import java.util.List;

public interface BookingService {
    List<BookingEntity> getAllBooking();

    BookingEntity createBooking(BookingEntity request);

    void cancelBooking(BookingEntity request);
}
