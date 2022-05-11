/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Threads implements Runnable{
    private int c = 0;
    private int x = 0;
    private Thread t0 = new Thread(this), t1 = new Thread(this), t2 = new Thread(this);
    
    public Threads(){
        t0.start();
        t1.start();
        t2.start();
        t0.setPriority(9);
        t1.setPriority(7);
        t2.setPriority(3);
        
    }
    
    @Override
    public void run(){
        synchronized(this){
            for(int i = 1; i <= 1000; i++){
                c++;
                x = i;
            }
    
            System.out.println(Thread.currentThread().getName() + "\t" + c + "\t" + x);
        }
    }
}
