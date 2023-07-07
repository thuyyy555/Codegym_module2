package src.service;

import src.model.Booking;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public interface ContractService {
    void createNewContract();
    LinkedList<Booking> creatListBooking();
    void displayListContract();
    void editContract();
}
