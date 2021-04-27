package com.whatIdobymyself;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class PersonTester {
    public static void main(String[] args) {
    Person person = new Person("John", "Doe", "10", "25", "1900", "123-45-6789");
        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.returnBirthday(person.getBirthmonth(), person.getBirthday(), person.getBirthyear()));
        System.out.println(person.getSsn());
    }
}
