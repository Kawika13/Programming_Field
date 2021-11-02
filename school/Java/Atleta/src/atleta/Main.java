package atleta;


public class Main {

    public static void main(String[] args) {
        
        // int age, int weight, int height, String name, String surname, String sport, boolean visitaMedica
        Atleta x = new Atleta(22, 75.6, 181, "Paolo", "Mazzini", "Hockey", false);
        
        x.setCountry("Italia");
        x.effettuaVisita();
        x.info();
    }
    
}
