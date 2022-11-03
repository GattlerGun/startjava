package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner scan = new Scanner(System.in);
    private static final Bookshelf bookshelf = new Bookshelf();
    private static boolean isWork = true;
    private static int userAnswer;

    public static void main(String[] args) {
        do {
            outputMessage();
            outputMenu();
            inputPointNumber();
            if(userAnswer != 4 && userAnswer != 5) {
                outputBookShelf(bookshelf.getAll());
            }
            if(isWork) {
                inputEnter();
            } else {
                System.out.print("Quitting...");
            }
        } while(isWork);
    }

    private static void outputMessage() {
        if(bookshelf.getBookOnShelf() == 0) {
            System.out.println("The bookcase is empty. You can add the first book to it");
        } else {
            System.out.println("Bookcase contains " + bookshelf.getBookOnShelf() + " books. Free — " +
                    bookshelf.getEmptyShelf() + " shelves.");
        }
    }

    private static void outputMenu() {
        System.out.println("""
                           MENU\040
                    <enter point number>
                    1. Delete <title>
                    2. Clear shelf
                    3. Add <author> <title> <publishYear>
                    4. Find <title>
                    5. Quit""");
    }

    private static void inputPointNumber() {
        userAnswer = Integer.parseInt(scan.nextLine());
        switch(userAnswer) {
            case 1 -> {
                System.out.print("Delete book <title>: ");
                bookshelf.delete(scan.nextLine());
            }
            case 2 -> {
                bookshelf.clearShelf();
                System.out.println("Bookshelf cleaning");
            }
            case 3 -> {
                System.out.println("Input pattern: <author> <title> <publishYear>");
                bookshelf.add(new Book(scan.nextLine(), scan.nextLine(), scan.nextLine()));
            }
            case 4 -> {
                System.out.print("Find book <title>: ");
                System.out.println(bookshelf.find(scan.nextLine()));
            }
            case 5 -> isWork = false;
        }
    }

    private static void outputBookShelf(Book[] books) {
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

    private static void lengthShelf(Book book) {
        int length = 0;
        if(book != null) {
            length = book.toString().length();
        }
        for(int i = 0; i < bookshelf.maxLengthShelf() - length; i++) {
            System.out.print(" ");
        }
        System.out.print("|\n|");
        for(int i = 0; i < bookshelf.maxLengthShelf(); i++) {
            System.out.print("-");
        }
        System.out.println("|");
    }

    private static void inputEnter() {
        System.out.println("Press Enter to continue working");
        scan.nextLine();
    }
}
