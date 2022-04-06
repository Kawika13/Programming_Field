

public class Vassoio {
    int unDato;
    boolean vassoioPieno = false;
   
    void prendi(){
        while(!vassoioPieno){}
        
        synchronized(this){
            System.out.println("Preso: " + unDato);
            vassoioPieno = false;
        }
    }
    
    void metti(int d){
        while(vassoioPieno){}
        
        synchronized(this){
            unDato = d;
            System.out.println("Depositato: " + unDato);
            vassoioPieno = true;
        }
    }
        
}
