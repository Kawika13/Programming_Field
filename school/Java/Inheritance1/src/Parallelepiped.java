/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Parallelepiped extends Rectangle{
    
    private double bHigh;

    public Parallelepiped(double bHigh, double base, double high) {
        super(base, high);
        this.bHigh = bHigh;
    }
    
    public double volume(){
        return area(base, bHigh) * high;
    }
}
