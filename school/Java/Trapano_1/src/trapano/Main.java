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
public class Main {

    public static void arrayData(int[] a){
        
        Scanner sc=new Scanner(System.in);
            
        for(int i = 0; i<2; i++){
            System.out.print("> ");
            a[i] = sc.nextInt();
        }
    }
    
    public static void main(String[] args) {
        
        int[] array = new int[2];
        Trapano trapano = new Trapano(array, false);
        
        arrayData(array);
       
        trapano.pierce();
        
        trapano.setOn(true);
        
        trapano.pierce();
        trapano.getPierces();
        
    }
    
}
