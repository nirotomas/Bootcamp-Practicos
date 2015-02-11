/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.util.Date;
/**
 *
 * @author Tomas
 */
public class Course {
    
  private String name;
  private int teacher;
  private Date WeekHours = new Date();
  private String schedule;

    public Course(String name, int teacher, String schedule) {
        this.name = name;
        this.teacher = teacher;
        this.schedule = schedule;
    }

    public Course() {
    }

  
    public void setName(String name) {
        this.name = name;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public void setWeekHours(Date WeekHours) {
        this.WeekHours = WeekHours;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public int getTeacher() {
        return teacher;
    }

    public Date getWeekHours() {
        return WeekHours;
    }

    public String getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Course{" + "name=" + name + ", teacher=" + teacher + ", WeekHours=" + WeekHours + ", schedule=" + schedule + '}';
    }
  
}
