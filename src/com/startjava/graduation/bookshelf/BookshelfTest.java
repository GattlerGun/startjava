package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner scan = new Scanner(System.in);
    private static final Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        do {
            outputShelfCondition();
            outputMenu();
        } while(selectMenuItem() != 5);
    }

    private static void outputShelfCondition() {
        if(bookshelf.getBooksOnShelf() == 0) {
            System.out.println("The bookcase is empty. You can add the first book to it");
        } else {
            System.out.println("Bookcase contains " + bookshelf.getBooksOnShelf() + " books. Free — " +
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
                System.out.println("""
                        Input pattern:
                        <author> (input Enter)
                        <title> (input Enter)
                        <publishYear> (input Enter)""");
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
            default -> System.out.println("There is no such menu item, enter the correct item!");
        }
        if(menuItem != 4 && menuItem != 5) {
            outputBookShelf(bookshelf.getAll());
            inputEnter();
        }
        return menuItem;
    }

    private static void outputBookShelf(Book[] books) {
        int maxLength = bookshelf.getMaxLengthShelf();
        if (bookshelf.getBooksOnShelf() != 0) {
            for (Book book : books) {
                outputShelf(book.toString(), maxLength, book.toString().length());
            }
            if(bookshelf.getEmptyShelf() != 0) {
                outputShelf("", maxLength, 0);
            }
        }
    }

    private static void inputEnter() {
        System.out.println("Press Enter to continue working");
        scan.nextLine();
    }

    private static void outputShelf(String book, int maxLength, int length) {
        System.out.print("|" + book + " ".repeat(maxLength - length) +
                "|\n|" + "-".repeat(maxLength));
        System.out.println("|");
    }
}
