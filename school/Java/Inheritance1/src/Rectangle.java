/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Rectangle {
    public double base, high;

    public Rectangle(double base, double high) {
        this.base = base;
        this.high = high;
    }

    public double getBase() {
        return base;
    }

    public double getHigh() {
        return high;
    }
    
    public double perimeter(){
        return base*2 + high*2;
    }
    
    public double area(double base, double high){
        return base * high;
    }
}
