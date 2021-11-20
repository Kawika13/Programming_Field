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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Penna pen = new Penna("bic", "nero", 130);
        PennaCancellabile pen1 = new PennaCancellabile("bic", "rosso", 0, 90);
        
        System.out.println(pen1.isUsable());
        pen1.usePen(-1);
    }
    
}
