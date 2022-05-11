/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Cons_even implements Runnable{
    Buffer b;
    
    public Cons_even(Buffer b){
        this.b = b;
        new Thread(this, "Even").start();
    }
    
    @Override
    public void run(){
        for(int i = 0; i < 10; i++){
            if(b.data % 2 == 0)
                b.take();
        }
    }
}
