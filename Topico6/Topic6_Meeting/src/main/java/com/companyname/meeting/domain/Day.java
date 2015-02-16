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
public class Day {

   private String day;
   private String init_hr;
   private String fin_hr;

    public String getDay() {
        return day;
    }

    public String getInit_hr() {
        return init_hr;
    }

    public String getFin_hr() {
        return fin_hr;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setInit_hr(String init_hr) {
        this.init_hr = init_hr;
    }

    public void setFin_hr(String fin_hr) {
        this.fin_hr = fin_hr;
    }

    @Override
    public String toString() {
        return "Day{" + "day=" + day + ", init_hr=" + init_hr + ", fin_hr=" + fin_hr + '}';
    }

}
