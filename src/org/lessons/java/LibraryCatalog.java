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
            Book book = new Book();
            try {
                System.out.println("Inserisci il titolo del libro:");
                book.setTitle(scanner.nextLine());

                System.out.println("Inserisci il numero di pagine:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Inserisci un numero valido:");
                    scanner.next();
                }
                book.setPageCount(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Inserisci l'autore:");
                book.setAuthor(scanner.nextLine());

                System.out.println("Inserisci l'editore: ");
                book.setPublisher(scanner.nextLine());

                books[i] = book;
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
                i--;
            }
        }

        System.out.println("Catalogo:");
        for (Book book : books) {
            System.out.println("Titolo: " + book.getTitle());
            System.out.println("Numero pagine: " + book.getPageCount());
            System.out.println("Autore: " + book.getAuthor());
            System.out.println("Editore: " + book.getPublisher());
            System.out.println();
        }
    }
}
