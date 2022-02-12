/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Frase {
    private String contenuto = "";
    
    public Frase(){}
    
    public void write(String c){
        contenuto += c;
    }
    
    public String getContenuto(){
        return contenuto;
    }
}
