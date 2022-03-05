/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class TV {
    private String marca;
    private boolean acceso;
    private int volume;
    private int canale;
    
    public TV(String marca){
        this.marca = marca;
        this.canale = 0;
        this.volume = 10;
    }
    
    public void accensione(){
        acceso = true;
    }
    
    public void spegnimento(){
        acceso = false;
    }
    
    public void aumCanale(){
        if(canale<5)
            canale++;
        else
            canale = 1;
    }
    
    public void dimCanale(){
        if(canale>1)
            canale--;
        else
            canale = 5;
    }
    
    
    public void alzaVolume(){
        if(volume<50)
            volume++;
    }
    
    public void dimVolume(){
        if(volume>0)
            volume--;
    }

    public void setCanale(int canale) {
        if(canale>0 && canale<1000)
            this.canale = canale;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanale() {
        return canale;
    }
    
    public boolean isAcceso(){
        return acceso;
    }
    
    public String info(){
        return "canale: "+canale+" - volume: "+volume+" - stato: "+acceso;
    }
}