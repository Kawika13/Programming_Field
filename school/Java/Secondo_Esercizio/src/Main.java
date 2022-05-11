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
    public static void main(String[] args) {
        Buffer b = new Buffer();
        new Prod(b);
        new Cons_even(b);
        new Cons_odd(b);
        
    }
    
}
