/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Distributore dis = new Distributore();
        
        int ris, scelta;
        while (true){
            System.out.println("M A C C H I N A   S P E N T A");
            System.out.println(dis);
            System.out.println("Premi un tasto per accendere la macchina");
            String acc = input.next();
            
            dis.accensioneSpegnimento();
            System.out.println(dis);
            
            System.out.println("\nMENU'\n1.Inserimento gettone\n2.Caffè\n3.Cappuccino\n4.Restituzione credito\n5.Svuota la gettoniera e ricarica la macchina\n0.Spegni");
            
            do{
                System.out.println("Scegli: ");
                scelta=input.nextInt();
                switch (scelta){
                    case 1:
                        ris = dis.inserimentoGettone();
                        if (ris == 1)
                            System.out.println("GETTONIERA PIENA");
                        else
                            System.out.println("Credito: " + dis.getCredito());
                        break;
                    case 2:
                        ris = dis.prendiCaffe();
                        if (ris == 0)
                            System.out.println("Buon caffè!");
                        else if (ris == 1)
                            System.out.println("CAFFE' NON PRESENTE");
                        else if (ris == 2)
                            System.out.println("CREDITO INSUFFICIENTE");
                        break;
                    case 3:
                        ris=dis.prendiCappuccino();
                        if (ris == 0)
                            System.out.println("Buon cappuccino!");
                        else if (ris == 1)
                            System.out.println("CAPPUCCINO NON PRESENTE");
                        else if (ris == 2)
                            System.out.println("CREDITO INSUFFICIENTE");
                        break;
                    case 4:
                        dis.restituisciCredito();
                        System.out.println("Credito: " + dis.getCredito());
                        break;
                    case 5:
                        dis.svuotaERicarica();
                        break;
                    case 0:
                        dis.accensioneSpegnimento();
                        break;
                    default:
                        System.out.println("TASTO NON ATTIVO");
                }
                System.out.println(dis);
            }while (scelta != 0);
        }
    }
}
