package com.company;

import org.joda.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

public class doWork {
    public void createEmployee() {
        List<Certifications> certs = new ArrayList<>();
        certs.add(Certifications.Commercial);
        certs.add((Certifications.OSHA10));
        certs.add(Certifications.JourneyManCard);



        Employee john = new Employee(("John"), ("Jingle"), new LocalDate(), certs);

        System.out.println(john.hireDate);

        System.out.println(john.getCertifications().toString());
        }
    }


