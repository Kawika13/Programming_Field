/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Buffer {
    int data = 0;
    boolean empty = true;
    
    public Buffer(){}
    
    public void put(int x){
        
        while(!empty){}
        
        data = x;
        System.out.println("Put:\t\t" + data);
        empty = false;
    }
    
    public int take(){
        
        while(empty){}

        System.out.println("Taken:\t\t" + data + "\t" + Thread.currentThread().getName());
        empty = true;
        return data;
     
    }
}
