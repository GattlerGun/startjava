package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int LENGTH_BOOK_SHELF = 10;
    private final Book[] books = new Book[LENGTH_BOOK_SHELF];
    private int booksOnShelf;
    private static int length;

    public void add(Book book) {
        if(booksOnShelf < books.length) {
            books[booksOnShelf] = book;
            booksOnShelf++;
        } else {
            System.out.println("Cannot be added because the shelf ran out of space");
        }
    }

    public Book find(String title) {
        if(books[findBook(title)].title().equals(title)) {
            return books[findBook(title)];
        }
        System.out.println("The book was not found because it is not on the shelf");
        return null;
    }

    public void delete(String title) {
        if(books[findBook(title)].title().equals(title)) {
            booksOnShelf--;
            System.arraycopy(books, findBook(title) + 1, books, findBook(title),
                    booksOnShelf - findBook(title));
            if(getMaxLengthShelf() == books[findBook(title)].toString().length()) {
                length = 0;
            }
            books[booksOnShelf] = null;
        } else {
            System.out.println("The book has not been removed because it is not on the shelf");
        }
    }

    public Book[] getAll() {
        if(booksOnShelf < LENGTH_BOOK_SHELF) {
            return Arrays.copyOf(books, booksOnShelf + 1);
        }
        return Arrays.copyOf(books, booksOnShelf);
    }

    public void clearShelf() {
        Arrays.fill(books, 0, booksOnShelf, null);
        booksOnShelf = 0;
    }

    public int getBooksOnShelf() {
        return booksOnShelf;
    }

    public int getEmptyShelf() {
        return books.length - booksOnShelf;
    }

    public int getMaxLengthShelf() {
        if(booksOnShelf != 0) {
            length = books[0].toString().length();
        }
        for(int i =0; i < booksOnShelf - 1; i++) {
            if(length < books[i + 1].toString().length()) {
                   length = books[i + 1].toString().length();
            }
        }
        return length;
    }

    private int findBook(String title) {
        for(int i = 0; i < booksOnShelf; i++) {
            if (books[i].title().equals(title)) {
                return i;
            }
        }
        return 0;
    }
}
