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

    public static void main(String[] args) {
        
        Rectangle x = new Rectangle(5, 10.5);
        Parallelepiped y = new Parallelepiped(6.25, x.getBase(), x.getHigh());
        
        System.out.println("Rectangle perimeter: " + x.perimeter());
        System.out.println("Parallelepiped Volume: " + y.volume());
        
    }
    
}
