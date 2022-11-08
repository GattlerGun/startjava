package com.startjava.graduation.bookshelf;

public record Book(String author, String title, String yearPublish) {

    @Override
    public String toString() {
        return author + ", " +
                title + ", " +
                yearPublish;
    }

    public int getLength(Book this) {
        return this.toString().length();
    }
}
