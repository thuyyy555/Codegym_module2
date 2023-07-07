package src.service;

import src.model.Booking;

import java.util.LinkedList;

public interface BookingService {
    void addNewBooking();
    void displayListBooking();
    LinkedList<Booking> getList();
}
