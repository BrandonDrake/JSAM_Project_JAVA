package com.company;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {

    private String fName;
    private String lName;
    final LocalDate hireDate;
    private List<Certifications> certifications = new ArrayList<>();

    //region Constructors
    public Employee(String fName, String lName, LocalDate hireDate, List<Certifications> certs) {
        this.fName = fName;
        this.lName = lName;
        this.hireDate = hireDate;
        setCertifications(certs);
    }


    public List<Certifications> getCertifications() {
        return certifications;
    }

    private void setCertifications(List<Certifications> certs) {
        try {
            for(Certifications cert:certs) {
                certifications.add(cert);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //endregion

    //region Getters
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getFullName() {return lName + ", " + fName; }

    public LocalDate getHireDate() {
        return hireDate;
    }
    //endregion

    //region Setters
    public void setfName(String fName) {
        if(this.fName.equals(fName)) {
            System.out.println("Same first name");
        }else{this.fName = fName;}
    }

    public void setlName(String lName) {
        if(this.lName.equals(lName)){
            System.out.println("Same last name");
        }else{ this.lName = lName; }
    }
    //endregion
}
