/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Prod implements Runnable{
    Buffer b;
    
    public Prod(Buffer b){
        this.b = b;
        new Thread(this).start();
    }
    
    @Override
    public void run(){
        for(int i = 10; i < 20; i++)
            b.put(i);
    }
}
