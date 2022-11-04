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
        for(int i = 0; i < bookOnShelf; i++) {
            if(books[i].title().equals(title)) {
                System.out.println("Book on shelf: " + (i + 1));
                return books[i];

            }
        }
        System.out.println("The book was not found because it is not on the shelf");
        return null;
    }

    public void delete(String title) {
        for(int i = 0; i < bookOnShelf; i++) {
            if(books[i].title().equals(title)) {
                System.arraycopy(books, i + 1, books, i, bookOnShelf - i - 1);
                books[bookOnShelf - 1] = null;
                bookOnShelf--;
                break;
            }
        }
        System.out.println("The book has not been removed because it is not on the shelf");
    }

    public Book[] getAll() {
        return Arrays.copyOf(books, books.length);
    }

    public void clearShelf() {
        Arrays.fill(books, 0, bookOnShelf, null);
        bookOnShelf = 0;
    }

    public int getBookOnShelf() {
        return bookOnShelf;
    }

    public int getEmptyShelf() {
        return books.length - bookOnShelf;
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
