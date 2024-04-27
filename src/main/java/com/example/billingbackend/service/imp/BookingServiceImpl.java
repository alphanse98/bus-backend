package com.example.billingbackend.service.imp;

import com.example.billingbackend.entity.BookingEntity;
import com.example.billingbackend.repository.BookingRepository;
import com.example.billingbackend.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor

public class BookingServiceImpl implements BookingService {

    @Autowired
    public BookingRepository BookingRepository;


    public List<BookingEntity> getAllBooking() {
        return BookingRepository.findAll();
    }

    public BookingEntity createBooking(BookingEntity request) {
        return BookingRepository.save(request);
    }

    public void cancelBooking(BookingEntity request) {
        BookingRepository.delete(request);
    }
}
