/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcthread;
import java.util.*;

/**
 *
 * @author Studente
 */
public class CalcThread implements Runnable{
    public CalcThread() {
        Thread t1 = new Thread(this, "t1");
    Thread t2 = new Thread(this, "t2");
    
    t1.start();
    t2.start();
    }
    
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int a, b, sum;
        System.out.println(Thread.currentThread() + "Insert the first number:");
        a = in.nextInt();
        System.out.println(Thread.currentThread() + "Insert the second number:");
        b = in.nextInt();
        System.out.println(Thread.currentThread() + "Sum: " + a+b);
    }
}
