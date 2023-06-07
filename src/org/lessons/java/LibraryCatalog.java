package org.lessons.java;

import java.util.Scanner;
public class LibraryCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il numero di libri:");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            try {
                System.out.println("Inserisci il titolo del libro:");
                String title = scanner.nextLine();

                System.out.println("Inserisci il numero di pagine:");
                int pageCount = Integer.parseInt(scanner.nextLine());

                System.out.println("Inserisci l'autore:");
                String author = scanner.nextLine();

                System.out.println("Inserisci l'editore: ");
                String publisher = scanner.nextLine();

                Book book = new Book(title, pageCount, author, publisher);
                books[i] = book;
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Catalogo:");
        for (Book book : books) {
            if (book != null) {
                System.out.println("Titolo: " + book.getTitle());
                System.out.println("Numero pagine: " + book.getPageCount());
                System.out.println("Autore: " + book.getAuthor());
                System.out.println("Editore: " + book.getPublisher());
                System.out.println();
            }
        }
    }
}
