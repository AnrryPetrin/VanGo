package com.facens.vango.model;

public record CardDTO(Long id, String vehicle, String licensePlate, String departureLocation, String destination,
                      Integer availableSeats, String departureDate, String departureTime, Boolean accessibility) {

    public CardDTO(Card card) {

        this(
                card.getId(),
                card.getVehicle(),
                card.getLicensePlate(),
                card.getDepartureLocation(),
                card.getDestination(),
                card.getAvailableSeats(),
                card.getDepartureDate(),
                card.getDepartureTime(),
                card.getAccessibility()
        );
    }

}