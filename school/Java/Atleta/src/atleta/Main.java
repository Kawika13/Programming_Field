/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta;

/**
 *
 * @author Studente
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // int age, int weight, int height, String name, String surname, boolean visitaMedica
        Atleta x = new Atleta(22, 75.6, 181, "Paolo", "Mazzini", false);
        
        x.setCountry("Italia");
        x.effettuaVisita();
        x.info();
    }
    
}
