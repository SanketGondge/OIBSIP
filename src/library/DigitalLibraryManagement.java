package library;
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String name;
    String author;
    boolean isIssued;

    Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.isIssued = false;
    }
}

public class DigitalLibraryManagement {

    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println(" DIGITAL LIBRARY MANAGEMENT");
            System.out.println("1. Add Book (Admin)");
            System.out.println("2. View Book");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    viewBooks();
                    break;
                case 3:
                    issueBook();
            
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    System.out.println("Thank you for using Digital Library");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }

    
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Book Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, name, author));
        System.out.println("Book added successfully");
    }

    
    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            System.out.println(
                b.id + " | " + b.name + " | " + b.author +
                " | Issued: " + (b.isIssued ? "Yes" : "No")
            );
        }
    }


    static void issueBook() {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (!b.isIssued) {
                    b.isIssued = true;
                    System.out.println("Book issued successfully");
                } else {
                    System.out.println("Book already issued");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }

    
    static void returnBook() {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                if (b.isIssued) {
                    b.isIssued = false;
                    System.out.println("Book returned successfully");
                } else {
                    System.out.println("Book was not issued!");
                }
                return;
            }
        }
        System.out.println("Book not found!");
    }
}


