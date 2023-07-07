package src.service;

import src.model.Customer;

import java.util.LinkedList;

public interface CustomerService {
    void display();
    void create();
    void update();
    LinkedList<Customer> getList();
}
