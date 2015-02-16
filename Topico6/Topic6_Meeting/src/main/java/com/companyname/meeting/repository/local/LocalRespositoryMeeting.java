/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.meeting.repository.local;

import com.companyname.meeting.domain.Attendees;
import com.companyname.meeting.domain.Day;
import com.companyname.meeting.domain.Meeting;
import com.companyname.meeting.domain.Room;
import com.companyname.meeting.repository.MeetingRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomas
 */
public class LocalRespositoryMeeting implements MeetingRepository {

    private static final List<Meeting> meets = new ArrayList<>();

    public void printMeetings() {
        
        for (Meeting meet : meets) {
            
            System.out.println("\n"+meet);
            
            
        }
        
    }
    
    @Override
    public Meeting createMeeting(Room r, Attendees atte, Day day) {
        Meeting meet = new Meeting();
        meet.setAtte(atte);
        meet.setDay(day);
        meet.setRoom(r);
        meets.add(meet);
        return meet;
    }

    @Override
    public Meeting queryMeeting(Room r, Day day) {
        for (Meeting meet : meets) {
            //a meeting is identified by his room number, day and init time
            if((r.getNumber()== meet.getRoom().getNumber()) && (day.getDay().equals(meet.getDay().getDay())) && (day.getFin_hr().equals(meet.getDay().getFin_hr())) )
                return meet;
        }
        System.out.println("Metting not found");
        return null;
    }

    @Override
    public Meeting updateMeeting(Room r, Day day, Room new_r, Day new_day) {

        for (Meeting meet : meets) {
            //a meeting is identified by his room number, day and init time
            if((r.getNumber()== meet.getRoom().getNumber()) && (day.getDay().equals(meet.getDay().getDay())) && (day.getFin_hr().equals(meet.getDay().getFin_hr())) )
                System.out.println("update room, day and attendees");
                meet.setDay(new_day);
                meet.setRoom(new_r);
                return meet;
        }
        System.out.println("Metting not found");
        return null;
        
    }

    @Override
    public void cancelMeeting(Room r, Day day) {

        for (Meeting meet : meets) {
            //a meeting is identified by his room number, day and init time
            if((r.getNumber()== meet.getRoom().getNumber()) && (day.getDay().equals(meet.getDay().getDay())) && (day.getFin_hr().equals(meet.getDay().getFin_hr())) )
                meets.remove(meet);
        }
        System.out.println("Metting not found, not cancelled");
    }
    
    
    
}
