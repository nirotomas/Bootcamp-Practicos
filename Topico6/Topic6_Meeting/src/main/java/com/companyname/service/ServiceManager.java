/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.companyname.service;

import com.companyname.meeting.domain.Meeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Tomas
 */

@Service
public class ServiceManager {
    @Autowired
    private Meeting meeting;

    public void setMeeting(Meeting meeting) {
        this.meeting = meeting;
    }

    public Meeting getMeeting() {
        return meeting;
    }

}
