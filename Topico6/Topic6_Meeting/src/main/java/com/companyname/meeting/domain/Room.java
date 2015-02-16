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
public class Room {
    private int number;
    private int floor;
    private String building;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getNumber() {
        return number;
    }

    public int getFloor() {
        return floor;
    }

    public String getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return "Room{" + "number=" + number + ", floor=" + floor + ", building=" + building + '}';
    }
    
}
