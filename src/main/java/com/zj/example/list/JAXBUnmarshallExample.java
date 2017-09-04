package com.zj.example.list;

import com.zj.example.model.Customer;
import com.zj.example.model.Customers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class JAXBUnmarshallExample {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1000);
        customer.setName("moon");
        customer.setAge(18);
        Customers customers=new Customers();
        customers.add(customer);
        customers.add(customer);
        customers.add(customer);
        customers.add(customer);
        JAXBContext context= null;
        try {
            context = JAXBContext.newInstance(Customers.class);
            Marshaller marshaller=context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_ENCODING,"UTF-8");
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.setProperty(Marshaller.JAXB_FRAGMENT,true);
            marshaller.marshal(customers,System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
