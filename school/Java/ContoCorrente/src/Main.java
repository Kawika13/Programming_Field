/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
        
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // String name, String surname, String fiscalCode, int age
        ContoCorrente x = new ContoCorrente("Paolo", "Mazzini", "MZZ PLA 96R30 E202I", 25);
        ContoCorrente y = new ContoCorrente("Paola", "Mazzine", "MZZ PLA 96R70 E202M", 25);
        
        x.setBalance(1000);
        y.setBalance(500);
        
        System.out.println("Paolo Mazzini's balance: €" + x.getBalance());
        System.out.println("Paola Mazzine's balance: €" + y.getBalance());
        
        x.withdrawal(200);
        
        System.out.println("Paolo Mazzini's balance: €" + x.getBalance());
        System.out.println("Paola Mazzine's balance: €" + y.getBalance());
        
        x.payment(300, y);
        
        System.out.println("Paolo Mazzini's balance: €" + x.getBalance());
        System.out.println("Paola Mazzine's balance: €" + y.getBalance());
    }
    
}
