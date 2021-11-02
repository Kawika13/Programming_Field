package orologio;


public class Main {

    public static void main(String[] args) {
        
        Clock x = new Clock(24, 54, 32);
        
        x.viewTime();
        x.modify(25, 10, 64);
        x.viewTime();
        x.modify(12, 10, 34);
        x.viewTime();
        x.reset();
        x.viewTime();
    }
    
}
