package com.ul.vrs.entity.booking.decorator;

import com.ul.vrs.entity.booking.Booking;

public class BookingDecorator extends Booking {
    private final Booking booking;

    public BookingDecorator(Booking booking) {
        super(booking.getBookingId(), booking.getCustomer(), booking.getVehicle());
        this.booking = booking;
    }

    public long getPrice() {
        return this.booking.getPrice();
    }
}