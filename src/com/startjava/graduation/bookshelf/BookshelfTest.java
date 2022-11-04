package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner scan = new Scanner(System.in);
    private static final Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        int menuItem;
        do {
            outputShelfCondition();
            outputMenu();
            menuItem = selectMenuItem();
        } while(menuItem != 5);
    }

    private static void outputShelfCondition() {
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

    private static int selectMenuItem() {
        int menuItem = Integer.parseInt(scan.nextLine());
        switch(menuItem) {
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
                Book book = bookshelf.find(scan.nextLine());
                if(book != null) {
                    System.out.println(book);
                }
            }
            case 5 -> System.out.print("Quitting...");

        }
        if(menuItem != 5) {
            outputBookShelf(bookshelf.getAll());
            inputEnter();
        }
        return menuItem;
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
