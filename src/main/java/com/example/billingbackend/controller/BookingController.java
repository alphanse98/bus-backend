package com.example.billingbackend.controller;


import com.example.billingbackend.entity.BookingEntity;
import com.example.billingbackend.repository.BookingRepository;
import com.example.billingbackend.service.BookingService;
import com.example.billingbackend.service.imp.BookingServiceImpl;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@CrossOrigin("*")
public class BookingController {
    BookingServiceImpl BookingServiceImpl;
    BookingRepository BookingRepository;
    BookingService  BookingService;


    @GetMapping("api/getBookingList")
    public ResponseEntity<List<BookingEntity>> getAllBooking(BookingEntity request){
        System.out.println("system print get all" );
        List<BookingEntity> res = BookingService.getAllBooking();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }

    @PostMapping("api/bookTicket")
    public ResponseEntity<BookingEntity>  Booking (@RequestBody BookingEntity request){
        BookingEntity res = BookingService.createBooking(request);
        return new ResponseEntity<> (res,HttpStatus.CREATED);

    }

    @PostMapping("api/cancelBooking")
    public ResponseEntity<String> deleteBooking(@RequestBody BookingEntity request){
        BookingService.cancelBooking(request);
        return new ResponseEntity<>("Canceled Booking", HttpStatus.OK);
    }
}
