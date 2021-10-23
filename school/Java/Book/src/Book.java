/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Studente
 */
public class Book {
    
    private String title, author, publisher;
    private int pages, copies;
    private boolean loaned = false;

    public Book(String title, String author, String publisher, int pages, int copies) {     // with copies
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
        this.copies = copies;
    }

    public Book(String title, String author, String publisher, int pages) {                 // without copies
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pages = pages;
    }
    
    public void setCopies(int copies) {
        this.copies = copies;
    }
    
    public int getCopies() {
        return copies;
    }
    
    public void loan(){
        this.copies -= 1;
        loaned = true;
    }
    
    public void unloan(){
        if(loaned == true)
            this.copies += 1;
        else
            System.out.print("There aren't any loaned books, so the num of copies is like the original one");
        loaned = false;
    }

    
    
    
    
}
