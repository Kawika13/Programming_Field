/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penna;

/**
 *
 * @author Studente
 */
public class Penna {
    String brand, color;
    float inc, max_inc;
    private boolean usable;

    // Penna's constructor
    public Penna(String brand, String color, float inc) {
        this.brand = brand;
        this.color = color;
        this.inc = inc;
        this.max_inc = inc;
        
        if(inc > 0)
            usable = true;  
    }

    public boolean isUsable() {
        return usable;
    }
    
    // This method will simulate the usage of the pen's inc
    public void usePen(float quantity){
        if(inc > quantity && quantity > 0){
            inc -= quantity;
            System.out.printf("Your inc is now %.2f%s full %n", inc/max_inc*100, "%");
        }else{
            usable = false;
            System.out.println("You've finished the inc or you've inserted an unaceptable value");
        }
    }
    
    // This method will recharge the inc, resetting it
    public void recharge(){
        inc = max_inc;
        usable = true;
        System.out.println("Your inc is now full");
    }
}
