/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta;

import java.util.*;

/**
 *
 * @author Studente
 */
public class Atleta {
    
    private int age;
    private double weight, height;
    private String name, surname, country, sport;
    private boolean visitaMedica;

    public Atleta(int age, double weight, double height, String name, String surname, String sport, boolean visitaMedica) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.name = name;
        this.surname = surname;
        this.sport = sport;
        this.visitaMedica = visitaMedica;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void info(){
        System.out.println("Name : " + name);
        System.out.println("Surname : " + surname);
        System.out.println("Age : " + age);
        System.out.println("Weight : " + weight);
        System.out.println("Height: " + height);
        System.out.println("Sport: " + sport);
        System.out.println("Country: " + country);
        System.out.println("Medical examination, done? : " + visitaMedica);
    }
    
    public void effettuaVisita(){
        this.visitaMedica = true;
    }
    
}
