/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trapezio;


import java.math.*;
/**
 *
 * @author Studente
 */
public class Trapezio {

    private int minor_b, greater_b, side1, side2;
    private double height;
    /**
     * @param args the command line arguments
     */
    
    public Trapezio(int minor_b, int greater_b, double height, int side)               // Isosceles Trapezoid
    {
        this.minor_b = minor_b;
        this.greater_b = greater_b;
        this.height = Math.sqrt(Math.pow(side, 2) - Math.pow((greater_b - minor_b) / 2, 2));
        this.side1 = side;
    }
    
    public Trapezio(int minor_b, int greater_b, double height, int side1, int side2)    // Scalene Trapezoid - overloading (Polimorphysm)
    {
        this.minor_b = minor_b;
        this.greater_b = greater_b;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }
    
    double perimeter()
    {
        return (greater_b + minor_b) * height / 2;
    }
    
    double area()
    {
        return minor_b + greater_b + side1 + side2;
    }
}
