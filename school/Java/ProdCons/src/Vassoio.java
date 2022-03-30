

public class Vassoio {
    int unDato;
    
    synchronized void prendi(){
        System.out.println("preso: " + unDato);
    }
    
    synchronized void metti(int d){
        unDato = d;
        System.out.println("preso: " + unDato);
    }
        
}
