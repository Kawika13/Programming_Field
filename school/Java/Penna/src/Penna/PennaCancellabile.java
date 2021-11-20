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
public class PennaCancellabile extends Penna{
    float rubber, max_rubber;
    private boolean there;

    // PennaCancellabile's constructor
    public PennaCancellabile(String brand, String color, float inc, float rubber) {
        super(brand, color, inc);
        this.rubber = rubber;
        this.max_rubber = rubber;
        
        if(rubber > 0)
            there = true;
    }

    public boolean isThere() {
        return there;
    }
    
    // This method will simulate the usage of the pen's rubber
    public void useRubber(int quantity){
        if(rubber > quantity && quantity > 0){
            rubber -= quantity;
            System.out.printf("Your rubber is now at %.2f%s of it's cap%n", rubber/max_rubber*100, "%");
        }else
            there = false;
            System.out.println("You've finished the rubber or you've inserted an unaceptable value");
    }
    
    // This method will replace the old rubber with a new one
    public void replace(){
        rubber = max_rubber;
        there = true;
        System.out.println("Your rubber has been resetted");
    }
}
