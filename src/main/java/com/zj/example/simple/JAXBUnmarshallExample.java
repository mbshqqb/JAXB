package com.zj.example.simple;

import com.zj.example.model.Customer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;

public class JAXBUnmarshallExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1000);
        customer.setName("moon");
        customer.setAge(18);
        ArrayList<String>list=new ArrayList<String>();;
        try {
            File file = new File("customer.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(customer, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
