/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Consumatore implements Runnable{
    Vassoio v;
    
    public Consumatore (Vassoio unVassoio){
        this.v = unVassoio;
        new Thread(this, "Consumatore").start();
    }
    
    @Override
    public void run(){
        for (int i=0; i<10; i++)
            v.prendi();
    }
}
