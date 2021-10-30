/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orologio;

import java.util.*;
        
public class Clock {
    
    private int hour, min, sec;

    public Clock(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        
        validityCheck();
    }
    
    public void reset(){
        hour = 0;
        min = 0;
        sec = 0;
    }
    
    public void modify(int hour, int min, int sec){
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        
        validityCheck();
    }
    
    public void viewTime(){
        System.out.println(hour + "." + min + "." + sec);
    }
    
    public void validityCheck(){
        if(hour > 23 || min > 59 || sec > 59){
            System.out.println("Invalid class value, please use modify for retry");
            reset();
        }
    }
}
