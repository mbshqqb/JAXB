package com.zj.example.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "customerlist")
public class Customers {
    @XmlElement(name="name")
    String name;
    @XmlElement(name="customer")
    private List<Customer> customers;
    public Customers(){
        this.customers=new ArrayList<Customer>();
    }
    public void add(Customer customer){
        this.customers.add(customer);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
