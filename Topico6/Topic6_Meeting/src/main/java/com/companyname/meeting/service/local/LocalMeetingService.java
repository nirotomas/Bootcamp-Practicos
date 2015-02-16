/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.meeting.service.local;

import com.companyname.meeting.domain.Attendees;
import com.companyname.meeting.domain.Day;
import com.companyname.meeting.domain.Meeting;
import com.companyname.meeting.domain.Room;
import com.companyname.meeting.repository.MeetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas
 */
@Service
public class LocalMeetingService {
    
    private MeetingRepository repository;
    
    @Autowired
    public void setRepository(MeetingRepository repository) {
        this.repository = repository;
    }
    
    public Meeting createMeeting(Room r, Attendees atte, Day day){
        return this.repository.createMeeting(r, atte, day);
    }
  
    public Meeting queryMeeting(Room r, Day day){
        return this.repository.queryMeeting(r, day);
    }
    
    public Meeting updateMeeting(Room r, Day day, Room new_r, Day new_day){
        return this.repository.updateMeeting(r, day, new_r, new_day);
    }
    
    public void cancelMeeting(Room r, Day day){
        this.repository.cancelMeeting(r, day);
    }
    
}
