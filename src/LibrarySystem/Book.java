/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

import java.sql.Date;

/**
 *
 * @author Jurijs
 */
public class Book {

    private String title, author, publisher, avaliable, isbn;
    private int edition, loantime ;
    private Date pubDate;
   

    public Book(String title, String author, String publisher, String avaliable, String isbn, int edition, int loantime, Date pubDate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.avaliable = avaliable;
        this.isbn = isbn;
        this.edition = edition;
        this.loantime = loantime;
        this.pubDate = pubDate;
    }
  
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setAvaliable(String avaliable) {
        this.avaliable = avaliable;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public void setLoantime(int loantime) {
        this.loantime = loantime;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAvaliable() {
        return avaliable;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getEdition() {
        return edition;
    }

    public int getLoantime() {
        return loantime;
    }

    public Date getPubDate() {
        return pubDate;
    }
 
    @Override
    public String toString() {

        return title + " " + author + " " + publisher + " " + pubDate + " " + isbn + " " + edition;

    }
}
