/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Documento doc = new Documento("Title");
        Paragrafo p1 = new Paragrafo();
        Paragrafo p2 = new Paragrafo();
        Paragrafo p3 = new Paragrafo();
        Frase f = new Frase();
        
        f.write("Sono una frase");
        
        p1.addFrase(f);
        p2.addFrase(f);
        p3.addFrase(f);
        
        doc.addParagrafo(p1);
        doc.addParagrafo(p2);
        doc.addParagrafo(p3);
        
        System.out.println();
        /*
        int n = 1;
        int next_index = 0;
        int[] li = new int[n];
        int[] tmp = new int[n];
        
        if(next_index < n){
            li[next_index] = 4;
            next_index++;
        }else{
            n++;
            tmp = li;
            li = new int [n];
            for(int i = 0; i < n-1; i++)
                li[i] = tmp[i];
            li[next_index] = 2;
            next_index++;
        }
        if(next_index < n){
            li[next_index] = 2;
            next_index++;
        }else{
            n++;
            tmp = li;
            li = new int [n];
            for(int i = 0; i < n-1; i++)
                li[i] = tmp[i];
            li[next_index] = 3;
            next_index++;
        }
        if(next_index < n){
            li[next_index] = 7;
            next_index++;
        }else{
            n++;
            tmp = li;
            li = new int [n];
            for(int i = 0; i < n-1; i++)
                li[i] = tmp[i];
            li[next_index] = 1;
            next_index++;
        }
        
        
        for(int i = 0; i < n; i++)
            System.out.println(li[i]);
        */
        
    }
    
}
