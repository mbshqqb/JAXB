package com.zj.example.model;

public class CustomersFactory {
    public static Customers createCustomers(String name,Customer ...customerList){
        Customers customers=new Customers();
        customers.setName(name);
        for(Customer customer:customerList){
            customers.add(customer);
        }
        return customers;
    }
}
