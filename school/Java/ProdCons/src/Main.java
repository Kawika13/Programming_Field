/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Vassoio ilVassoio = new Vassoio();
        new Produttore(ilVassoio);
        new Consumatore(ilVassoio);
        
    }
    
}
