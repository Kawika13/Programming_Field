/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Squadra {
    
    // Attributes
    private String name, city;
    private int matchs, win, lose, pare; // default value equal 0
    
    // Constructor
    public Squadra(String name, String city) {
        this.name = name;
        this.city = city;
    }
    
    // Methods
    public void result(int a, Squadra y, int b){
        if(a > b){
            this.win += 1;
            y.lose += 1;
        }
        else if(a == b){
            this.pare += 1;
            y.pare += 1;
        }
        else{
            this.lose += 1;
            y.win += 1;
        }
    }
    
    public int pnts(){
        return win*3 + pare;
    }
    
    public boolean loser(){
        return win == 0;
    }
    
    public void show_info(){
        System.out.println("Nome: " + name + "\nCittà: " + city + "\nPartite: " + matchs + "\nVinte: " + win + "\nPerse: " + lose + "\nPareggiate: " + pare + "\n\n");
    }

}
