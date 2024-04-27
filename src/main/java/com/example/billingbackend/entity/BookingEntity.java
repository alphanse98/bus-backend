package com.example.billingbackend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="booking")
public class BookingEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String busNumber;

    @Column(nullable = false)
    private String date;

    @Column(nullable = false)
    private String startFrom;

    @Column(nullable = false)
    private String end;

    @Column(nullable = false)
    private String ticketPrice;

    @Column(nullable = false)
    private String seatNumber;

    @Column(nullable = false)
    private String passengerName;

    @Column(nullable = false)
    private String mobile;

    @Column(nullable = false)
    private String age;

    @Column(nullable = false)
    private String sex;
}
