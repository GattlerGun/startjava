package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private final Book[] books = new Book[10];
    private int bookOnShelf;

    public void add(Book book) {
        if(bookOnShelf < books.length) {
            books[bookOnShelf] = book;
            bookOnShelf++;
        } else {
            System.out.println("Cannot be added because the shelf ran out of space");
        }
    }

    public Book find(String title) {
        for(int i = 0; i < books.length; i++) {
            if(books[i] != null) {
                if(books[i].title().equals(title)) {
                    return books[i];
                }
                if(books[i + 1] == null) {
                    System.out.println("The book was not found because it is not on the shelf");
                    break;
                }
            }
        }
        return null;
    }

    public void delete(String title) {
        for(int i = 0; i < books.length; i++) {
            if(books[i].title().equals(title)) {
                books[i] = null;
                System.arraycopy(books, i + 1, books, i, books.length - i - 1);
                books[books.length - 1] = null;
                bookOnShelf--;
                break;
            }
            if(books[i + 1] == null){
                System.out.println("The book has not been removed because it is not on the shelf");
                break;
            }
        }
    }

    public Book[] getAll() {
        return books;
    }

    public void clearShelf() {
        Arrays.fill(books, 0, bookOnShelf, null);
        bookOnShelf = 0;
    }

    public int getBookOnShelf() {
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

    public int maxLengthShelf() {
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
}
