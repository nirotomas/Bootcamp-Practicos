/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.meeting.domain;

/**
 *
 * @author Tomas
 
 *  A meeting its identified by a room(identified by number) and a Day(identified by a day, init hr and fin hr)
 * 
 */

public class Meeting {
    
    private Attendees atte;
    private Room room;
    private Day day;

    public void setAtte(Attendees atte) {
        this.atte = atte;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setDay(Day day) {
        this.day = day;
    }

    public Attendees getAtte() {
        return atte;
    }

    public Room getRoom() {
        return room;
    }

    public Day getDay() {
        return day;
    }

    @Override
    public String toString() {
        return "Meeting{" + "atte=" + atte + ", room=" + room + ", day=" + day + '}';
    }

}
