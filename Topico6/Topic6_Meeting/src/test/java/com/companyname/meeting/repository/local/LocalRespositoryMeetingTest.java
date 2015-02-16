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
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tomas
 */
public class LocalRespositoryMeetingTest {
    
    public LocalRespositoryMeetingTest() {
    }

    /**
     * Test of getMeets method, of class LocalRespositoryMeeting.
     */
    
    @Test
    public void testGetMeets() {
        System.out.println("getMeets");
        List<Meeting> expResult = null;
       //List<Meeting> result = LocalRespositoryMeeting.getMeets();
       // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of createMeeting method, of class LocalRespositoryMeeting.
     */
    @Test
    public void testCreateMeeting() {
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.println("createMeeting");
        Room r = new Room();
        Attendees atte = new Attendees();
        Day day = new Day();
        
        r.setBuilding("Capitalinas");
        r.setFloor(3);
        r.setNumber(5);
        
        atte.setIdAttend("35168");
        atte.setName("Victor");
        
        day.setDay("18-02-2015");
        day.setFin_hr("not defined");
        day.setInit_hr("15:00");
        
        LocalRespositoryMeeting repository = new LocalRespositoryMeeting();
        Meeting meet = repository.createMeeting(r, atte, day);
        System.out.println(""+meet);
        
        System.out.print("List of meetings");
        repository.printMeetings();
        
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of queryMeeting method, of class LocalRespositoryMeeting.
     */
    @Test
    public void testQueryMeeting() {
System.out.println("----------------------------------------------------------------------------------------------------");        System.out.println("queryMeeting");
        
        Room r1 = new Room();
        Attendees atte1 = new Attendees();
        Day day1 = new Day();
        
        Room r = new Room();
        Attendees atte = new Attendees();
        Day day = new Day();
        
        r.setBuilding("Capitalinas");
        r.setFloor(3);
        r.setNumber(5);
        
        atte.setIdAttend("35168");
        atte.setName("Victor");
        
        day.setDay("18-02-2015");
        day.setFin_hr("not defined");
        day.setInit_hr("15:00");
        
        r1.setBuilding("Cañada");
        r1.setFloor(7);
        r1.setNumber(2);
        
        atte1.setIdAttend("3568");
        atte1.setName("Pablo");
        
        day1.setDay("19-02-2015");
        day1.setFin_hr("not defined");
        day1.setInit_hr("16:00");
        
        LocalRespositoryMeeting repository = new LocalRespositoryMeeting();
        Meeting meet = repository.createMeeting(r1, atte1, day1);
        Meeting meet1 = repository.createMeeting(r, atte, day);

        Meeting result = repository.queryMeeting(r, day);
        System.out.println("Meeting "+result+ "found");
        
        System.out.println("Print all meetings ");
        repository.printMeetings();
        
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of updateMeeting method, of class LocalRespositoryMeeting.
     */
    @Test
    public void testUpdateMeeting() {
System.out.println("----------------------------------------------------------------------------------------------------");        System.out.println("updateMeeting");

        Room r = new Room();
        Attendees atte = new Attendees();
        Day day = new Day();
        
        r.setBuilding("Capitalinas");
        r.setFloor(3);
        r.setNumber(5);
        
        atte.setIdAttend("35168");
        atte.setName("Victor");
        
        day.setDay("18-02-2015");
        day.setFin_hr("not defined");
        day.setInit_hr("15:00");
        
        Room new_r = new Room();
        Day new_day = new Day();
        
        new_r.setBuilding("Centro");
        new_r.setFloor(1);
        new_r.setNumber(15);
        
        new_day.setDay("25-02-2015");
        new_day.setFin_hr("not defined");
        new_day.setInit_hr("13:00");
        
        LocalRespositoryMeeting repository = new LocalRespositoryMeeting();
        
        Meeting result = repository.updateMeeting(r, day, new_r, new_day);
        System.out.println("meeting updated: "+result);
        System.out.println("Print all meetings ");
        repository.printMeetings();
        
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cancelMeeting method, of class LocalRespositoryMeeting.
     */
    @Test
    public void testCancelMeeting() {
System.out.println("----------------------------------------------------------------------------------------------------");        Room r = new Room();
        Attendees atte = new Attendees();
        Day day = new Day();
        
        r.setBuilding("Capitalinas");
        r.setFloor(3);
        r.setNumber(5);
        
        atte.setIdAttend("35168");
        atte.setName("Victor");
        
        day.setDay("18-02-2015");
        day.setFin_hr("not defined");
        day.setInit_hr("15:00");
        
        LocalRespositoryMeeting repository = new LocalRespositoryMeeting();

        repository.cancelMeeting(r, day);
        
        System.out.println("Print List of all Meetings");
        repository.printMeetings();
       

        // assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }
    
}
