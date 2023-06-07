package org.lessons.java;

import java.util.Scanner;

class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publisher;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) throws Exception {
        if (title.isEmpty()) {
            throw new Exception("Il titolo deve esserci per forza.");
        }
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) throws Exception {
        if (pageCount <= 0) {
            throw new Exception("Il numero di pagine deve essere maggiore di 0.");
        }
        this.pageCount = pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) throws Exception {
        if (author.isEmpty()) {
            throw new Exception("L'autore deve esserci per forza.");
        }
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) throws Exception {
        if (publisher.isEmpty()) {
            throw new Exception("L'editore deve esserci per forza.");
        }
        this.publisher = publisher;
    }
}
