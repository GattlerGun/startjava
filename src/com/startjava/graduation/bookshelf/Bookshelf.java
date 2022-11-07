package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    private static final int BOOKSHELF_LIMIT = 3;
    private final Book[] books = new Book[BOOKSHELF_LIMIT];
    private int booksOnShelf;
    private int maxLengthShelf;

    public void add(Book book) {
        if(booksOnShelf < BOOKSHELF_LIMIT) {
            books[booksOnShelf] = book;
            booksOnShelf++;
            setMaxLengthShelf();
        } else {
            System.out.println("Cannot be added because the shelf ran out of space");
        }
    }

    public Book find(String title) {
        int index = findIndex(title);
        if(index != -1) {
            return books[index];
        }
        System.out.println("The book was not found because it is not on the shelf");
        return null;
    }

    public void delete(String title) {
        int index = findIndex(title);
        if(index != -1) {
            booksOnShelf--;
            int lengthDeleteBook = books[index].toString().length();
            System.arraycopy(books, index + 1, books, index, booksOnShelf - index);
            books[booksOnShelf] = null;
            if(getMaxLengthShelf() == lengthDeleteBook) {
                maxLengthShelf = 0;
                setMaxLengthShelf();
            }
        } else {
            System.out.println("The book has not been removed because it is not on the shelf");
        }
    }

    public Book[] getAll() {
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
        return BOOKSHELF_LIMIT - booksOnShelf;
    }

    public void setMaxLengthShelf() {
        if(booksOnShelf != 0) {
            for(int i = 0; i < booksOnShelf; i++) {
                if (maxLengthShelf < books[i].toString().length()) {
                    maxLengthShelf = books[i].toString().length();
                }
            }
        }
    }

    public int getMaxLengthShelf() {
        return maxLengthShelf;
    }

    private int findIndex(String title) {
        for(int i = 0; i < booksOnShelf; i++) {
            if (books[i].title().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}
