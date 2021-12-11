/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Studente
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static Squadra search(String msg, Squadra arr[]){
        for(int j = 0; j < 5; j++){
            if(arr[j].getName() == msg)
                return arr[j];
        }
        return null;
    }
    
    public static void main(String[] args) {
        String name = null, city;
        String name1, name2; 
        Scanner in = new Scanner(System.in);
        Squadra arr[] = new Squadra[5]; 
        int z = 1, n = 0, m;

        for(int i = 0; i < 5; i++){
            System.out.println("Inserire il nome e la città di provenienza della squadra che si desidera aggiungere al campionato");
            name = in.nextLine();
            city = in.nextLine();
            
            Squadra x = new Squadra(name, city);
            arr[i] = x;
        }
        
        while(z != 0){
            
            System.out.print("\nData una squadra, selezionare: \n1) Per visionare il risultato di una partita dati i punteggi delle due squadre \n2) Per visionare il punteggio della squadra \n3) Per verificare se la squadra non ha vinto nemmeno un match \n0) Per uscire dall'esecuzione \n\n> ");
            z = in.nextInt();
            
            switch(z){
                case 0:
                    break;
                case 1:
                    System.out.println("Inserire la posizione della squadra in casa, il punteggio della squadra in casa, la posizione della squadra avversaria e il suo punteggio");
                    name1 = in.nextLine();
                    name2 = in.nextLine();
                    n = in.nextInt();
                    m = in.nextInt();
                    
                    if(n > m)
                        System.out.println("Vince la scquadra in casa");
                    else
                        System.out.println("Vince la squadra avversaria");
                    break;
                case 2:
                    for(int i = 0; i < 5; i++){
                        System.out.println("Il punteggio della squadra numero " + i+1 + " è di " + arr[i].pnts() + " punti \n");
                    }
                    break;
                case 3:
                    if(arr[1].loser()) 
                        System.out.println("La scquadra non ha vinto nemmeno un incontro");
                    else
                        System.out.println("La scquadra ha vinto almeno un incontro");
                    break;   
                default:
                    System.out.println("E' stato inserito un valore che non corrisponde ai citati in precedenza, prego ripetere la selezione\n");
                    break;
            }
        }
        
        for(int i = 0; i < 5; i++){
            arr[i].show_info();
        }
    }
}
