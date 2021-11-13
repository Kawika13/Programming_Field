/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapano;

import java.util.*;

/**
 *
 * @author Studente
 */
public class Trapano{
    
    boolean on;
    private int[] pierces = new int[10];
    private int[] positions = new int[2];
    
    public Trapano(int[] positions, boolean on) {
        this.positions = positions;
        this.on = on;
    }
    
    public void setOn(boolean on) {
        this.on = on;
        
        if(on == false)
            System.out.println("Il trapano è spento");
        else
            System.out.println("Il trapano è acceso");
    }
    
    public void setPositions(int[] positions) {
        
        if(this.on == false)
            this.positions = positions;
        else
            System.out.println("Il trapano dev'essere spento prima di essere spostato");
    }

    public int[] getPositions() {
        return positions;
    }
    
    public void pierce(){
        
        if(this.on == true){
            // todo matrix for array of array
        }
        else
            System.out.println("Il trapano dev'essere prima acceso per poter creare un buco");
    }

    public void getPierces() {
        
    }
     
}
