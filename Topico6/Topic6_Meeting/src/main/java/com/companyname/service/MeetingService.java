/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.service;

import com.companyname.meeting.domain.Attendees;
import com.companyname.meeting.domain.Meeting;
import com.companyname.meeting.domain.Room;
import com.companyname.meeting.domain.Day;
import java.util.Date;

/**
 *
 * @author Tomas
 */
public interface MeetingService {
    
    public Meeting createMeeting(Room r, Attendees atte, Day day);
    public Meeting queryMeeting(Room r, Day day);
    public Meeting updateMeeting(Room r, Day day, Room new_r, Day new_day);
    public Meeting cancelMeeting(Room r, Day day);
    
}
