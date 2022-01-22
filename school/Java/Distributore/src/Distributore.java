/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Distributore {
    private int caffe = 10;
    private int cappuccino = 10;
    private boolean acceso;
    private int credito = 0;
    private int totGettoni = 0;
    
    public Distributore(){}
    
    public void accensioneSpegnimento()
    {
        acceso =! acceso;
        /* if (acceso) acceso = false; else acceso = true; */
    }
    
    /** Inserisce un gettone nel distributore; 
     *  valore di ritorno: 
     *      0 - se l'operazione va a buon fine; 
     *      1 - se la gettoniera è piena e il gettone non può essere accettato; 
     *      100 - se la macchina è spenta
     */
    public int inserimentoGettone(){
        if (acceso){
            if (totGettoni < 12){
                credito++;
                totGettoni++;
                return 0;
            }else
                return 1;
        }
        return 100;
    }
    
    public int getCredito(){
        return credito;
    }
    
    public int prendiCaffe(){
        if (acceso)
            if (caffe > 0 && credito >= 1){
                credito--;
                caffe--;
                return 0;
            }
            else{
                if (caffe == 0) 
                    return 1; //non c'è caffè
                else 
                    return 2; //non c'è credito
            }
        else
            return 100;
    }

    public int getCaffe() {
        return caffe;
    }
    
    public int prendiCappuccino(){
        if (acceso)
            if (cappuccino > 0 && credito >= 2){
                credito -= 2;
                cappuccino--;
                return 0;
            }
            else{
                if (cappuccino == 0) 
                    return 1; //non c'è cappuccino
                else 
                    return 2; //non c'è credito
            }
        else
            return 100;
    }

    public int getCappuccino() {
        return cappuccino;
    }
    
    public int restituisciCredito(){
        if (acceso){
            credito = 0;
            return 0;
        }else
            return 100;
    }
    
    public int svuotaERicarica(){
        if (acceso){
            totGettoni = 0;
            caffe = 10;
            cappuccino = 10;
            return 0;
        }else
            return 100;
    }

    public boolean isAcceso() {
        return acceso;
    }
    
    @Override
    public String toString(){
        return "STATO [[ Accesa: " + acceso + " - N.caffè: " + caffe + " - N.cappuccini: " + cappuccino + " - Credito: " + credito + " - Gettoniera : " + totGettoni+ "]]";
    }
}