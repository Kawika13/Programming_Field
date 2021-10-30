/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class ContoCorrente {
    
    private String name, surname, fiscalCode;
    private int age;
    private double balance;

    public ContoCorrente(String name, String surname, String fiscalCode, int age) {
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    
    public void withdrawal(double money){
        balance += money;
    }
    
    public void payment(double money, ContoCorrente a){
        balance -= money;
        a.withdrawal(money);
    }
    
}
