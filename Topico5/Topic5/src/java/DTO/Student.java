/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


/**
 *
 * @author Tomas
 */
public class Student {
    private int regNumber;
    private String firstName;
    private String lastName;
    private String birth;

    public Student(String firstName, String lastName, int regNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
    }

    public Student() {
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public int getRegNumber() {
        return regNumber;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirth() {
        return birth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" + "firstName=" + firstName + ", lastName=" + lastName + ", birth=" + birth + '}';
    }
    
    
}
