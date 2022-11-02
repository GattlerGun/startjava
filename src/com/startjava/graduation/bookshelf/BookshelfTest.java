package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        boolean isWork = true;
        do {
            bookshelf.outputMessage();
            System.out.println("""
                    1. Delete <title>
                    2. Clear shelf
                    3. Add <author> <title> <publishYear>
                    4. Find <title>
                    5. Quit""");
            int userAnswer = Integer.parseInt(scan.nextLine());
            switch (userAnswer) {
                case 1 -> {
                    System.out.print("Delete book <title>: ");
                    bookshelf.deleteBook(scan.nextLine());
                    bookshelf.getAllBooks();
                }
                case 2 -> {
                    bookshelf.clearShelf();
                    System.out.println("Bookshelf cleaning");
                }
                case 3 -> {
                    System.out.println("Input pattern: <author> <title> <publishYear>");
                    bookshelf.addBook(new Book(scan.nextLine(), scan.nextLine(), scan.nextLine()));
                    bookshelf.getAllBooks();
                }
                case 4 -> {
                    System.out.print("Find book <title>: ");
                    bookshelf.findBook(scan.nextLine());
                }
                case 5 -> isWork = false;
            }
            if(isWork) {
                inputEnter();
            } else {
                System.out.print("Quitting...");
            }
        } while(isWork);
    }

    private static void inputEnter() {
        System.out.println("Press Enter to continue working");
        scan.nextLine();
    }
}
