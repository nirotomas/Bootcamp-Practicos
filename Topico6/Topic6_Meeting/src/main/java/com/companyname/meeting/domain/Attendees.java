/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.meeting.domain;

/**
 *
 * @author Tomas
 */
public class Attendees {
    private String name;
    private String idAttend;

    public void setName(String name) {
        this.name = name;
    }

    public void setIdAttend(String idAttend) {
        this.idAttend = idAttend;
    }

    public String getName() {
        return name;
    }

    public String getIdAttend() {
        return idAttend;
    }

    @Override
    public String toString() {
        return "Attendees{" + "name=" + name + ", idAttend=" + idAttend + '}';
    }
}
