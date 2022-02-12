/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Paragrafo {
    private Frase[] phrases = new Frase[10];
    private int next_index = 0;
    
    public Paragrafo(){}
    
    public void addFrase(Frase f){
        if(next_index < 10){
            phrases[next_index] = f;
            next_index++;
        }else{
            System.out.println("Not enough space in the paragraph");
        }
    }
    
    public void rmFrase(){}
    
    
    @Override
    public String toString(){
        return "";
    } 
}
