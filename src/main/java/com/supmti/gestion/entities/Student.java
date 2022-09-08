package com.supmti.gestion.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Table(name = "student")
@Entity
public class Student {
    @Id
    @Column(unique=true)
    private Integer cin;
    private String firstName;

    private String LastName;

    @Column(name = "Date_Of_Birth", nullable = false )
    private LocalDate dateOfBirth;

    public Integer getCin() {
        return cin;
    }

    public void setCin(Integer cin) {
        this.cin = cin;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Student() {
    }
}
