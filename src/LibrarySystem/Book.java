/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *
 * @author Jurijs
 */
public class Book {

    private String title, author, publisher, pubDate;
    private int isbn, edition;

    public Book(String bTitle, String bAuthor, String bPublisher, String bPubDate, int bIsbn, int bEdition) {

        this.title = bTitle;
        this.author = bAuthor;
        this.publisher = bPublisher;
        this.pubDate = bPubDate;
        this.isbn = bIsbn;
        this.edition = bEdition;

    }

    public String getBookTitle() {

        return title;

    }

    public String getBookAuthor() {

        return author;

    }

    public String getBookPublisher() {

        return publisher;

    }

    public String getBookPubDate() {

        return pubDate;

    }

    public int getBookIsbn() {

        return isbn;

    }

    public int getBookEdition() {

        return edition;

    }

    @Override
    public String toString() {

        return title + " " + author + " " + publisher + " " + pubDate + " " + isbn + " " + edition;

    }
}
