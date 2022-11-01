package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private final Book[] books = new Book[10];

    public void addBook(Book book) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                books[i] = book;
                break;
            }
            if(getBookOnShelf() == books.length) {
                System.out.println("Cannot be added because the shelf ran out of space");
                break;
            }
        }
    }

    public void findBook(String title) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                if(books[i].title().equals(title)) {
                    System.out.println(books[i]);
                    break;
                }
                if(books[i + 1] == null){
                    System.out.println("The book was not found because it is not on the shelf");
                    break;
                }
            }
        }
    }

    public void deleteBook(String title) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].title().equals(title)) {
                books[i] = null;
                for(int k = i; k < books.length - 1; k++) {
                    if(books[k + 1] != null) {
                        System.arraycopy(books, k + 1, books, k, 1);
                        books[k + 1] = null;
                    }
                }
                break;
            }
            if(books[i + 1] == null){
                System.out.println("The book has not been removed because it is not on the shelf");
                break;
            }
        }
    }

    public void getAllBooks() {
        for(Book book : books) {
            if(books[0] != null) {
                if(book != null) {
                    System.out.print("|" + book);
                    lengthShelf(book);
                }
                if(book == null) {
                    System.out.print("|");
                    lengthShelf(null);
                    break;
                }
            }
        }
    }

    private void lengthShelf(Book book) {
        int length = 0;
        if(book != null) {
            length = book.toString().length();
        }
        for(int i = 0; i < maxLengthShelf() - length; i++) {
            System.out.print(" ");
        }
        System.out.print("|\n|");
        for(int i = 0; i < maxLengthShelf(); i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    private int maxLengthShelf() {
        int length = 0;
        if(books[0] != null) {
            length = books[0].toString().length();
        }
        for(int i =0; i < books.length - 1; i++) {
            if(books[i] != null && books[i + 1] != null) {
                if(length < books[i + 1].toString().length()) {
                    length = books[i + 1].toString().length();
                }
            }
        }
        return length;
    }

    public void outputMessage() {
        if(books[0] == null) {
            System.out.println("The bookcase is empty. You can add the first book to it");
        } else {
            System.out.println("Bookcase contains " + getBookOnShelf() + " books. Free — " +
                    getEmptyShelf() + " shelves.");
        }
    }

    public int getBookOnShelf() {
        int bookOnShelf = 0;
        for(Book book : books) {
            if(book != null) {
                bookOnShelf++;
            }
        }
        return bookOnShelf;
    }

    public int getEmptyShelf() {
        int EmptyShelf = 0;
        for(Book book : books) {
            if(book == null) {
                EmptyShelf++;
            }
        }
        return EmptyShelf;
    }

    public void clearShelf() {
        Arrays.fill(books, null);
    }
}
