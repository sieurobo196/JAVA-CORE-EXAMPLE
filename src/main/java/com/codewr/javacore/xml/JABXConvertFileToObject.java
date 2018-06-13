package com.codewr.javacore.xml;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author codewr
 */
public class JABXConvertFileToObject {

    public static void main(String[] args) {

        try {

            File file = new File("C:\\uploadFile\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
//            System.out.println(customer.toString());
            System.out.println("id: "+customer.getId());
            System.out.println("name: "+customer.getName());
            System.out.println("age: "+customer.getAge());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
