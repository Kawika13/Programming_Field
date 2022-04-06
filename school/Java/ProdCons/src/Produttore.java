/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Produttore implements Runnable{
    Vassoio v;
    
    public Produttore(Vassoio unVassoio){
        this.v = unVassoio;
        new Thread(this, "Produttore").start();
    }

    @Override
    public void run() {
        for (int i=45; i<55; i++)
            v.metti(i);
    }
}
