package com.zj.example.factory;

import com.zj.example.model.Customer;
import com.zj.example.model.Customers;
import com.zj.example.model.CustomersFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JAXBUnmarshallExample {
    public static void main(String[] args) {
        JAXBContext context= null;
        try {
            context = JAXBContext.newInstance(Customers.class);
            Unmarshaller unmarshaller=context.createUnmarshaller();
            unmarshaller.unmarshal(new File("customer.xml"));
            System.out.println(((Customers)unmarshaller.getProperty("customerlist")).getName());

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
