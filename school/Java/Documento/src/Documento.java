/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Documento {
    private int MAX_SPACE = 1;
    
    private String titolo;
    private Paragrafo[] paragraphs = new Paragrafo[MAX_SPACE];
    private int next_index = 0;
    
    private Paragrafo[] tmp = new Paragrafo[100];
    
    public Documento(String titolo){
        this.titolo = titolo;
    }
    
    public void addParagrafo(Paragrafo p){

        if(next_index < MAX_SPACE){
            paragraphs[next_index] = p;
            next_index++;
        }else{
            MAX_SPACE++;
            tmp = paragraphs;
            paragraphs = new Paragrafo[MAX_SPACE];
            for(int i = 0; i < MAX_SPACE-1; i++)
                paragraphs[i] = tmp[i];
            this.addParagrafo(p);
        }
    }
    
    @Override
    public String toString(){
        return "";
    }
    
    
}
