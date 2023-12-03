package com.facens.vango.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "Card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "vehicle", length = 100, nullable = false)
    private String vehicle;

    @Column(name = "license plate", length = 7, nullable = false)
    private String licensePlate;

    @Column(name = "departure location", length = 255, nullable = false)
    private String departureLocation;

    @Column(name = "destination", length = 255, nullable = false)
    private String destination;

    @Column(name = "available seats", nullable = false)
    private Integer availableSeats;

    @Column(name = "departure date", length = 255, nullable = false)
    private String departureDate;

    @Column(name = "departure time", length = 255, nullable = false)
    private String departureTime;

    @Column(name = "Accessibility", nullable = false)
    private Boolean accessibility;

}
