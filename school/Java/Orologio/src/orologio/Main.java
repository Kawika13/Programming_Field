/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orologio;

/**
 *
 * @author Studente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clock x = new Clock(24, 54, 32);
        
        x.viewTime();
        x.modify(25, 10, 64);
        x.viewTime();
        x.modify(12, 10, 34);
        x.viewTime();
        x.reset();
        x.viewTime();
    }
    
}
