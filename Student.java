import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private Scanner scanner;
    private String name;
    private String nim;
    private String faculty;
    private String studyProgram;
    private List<Book> borrowedBooks;

    public Student(String nama, String nim, String faculty, String studyProgram) {
        this.name = nama;
        this.nim = nim;
        this.faculty = faculty;
        this.studyProgram = studyProgram;
        this.borrowedBooks = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }


    public static void displayBooks(Book[] books) {
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " (" + book.getAuthor() + ") - " + book.getStock() + " copies available");
        }
    }

    public void displayBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("Kamu belum ada buku ^_^");
        } else {
            System.out.println("Buku yang sudah diambil:");
            for (Book book : borrowedBooks) {
                System.out.println(book.getTitle() + " (" + book.getAuthor() + ")");
            }
        }
    }

    public void borrowBook(Book[] bookList) {
        Scanner scanner = new Scanner(System.in); // Initialize scanner locally
        System.out.println("Enter the ID of the book you want to borrow: ");
        String bookId = scanner.nextLine();

        for (Book book : bookList) {
            if (book.getId().equals(bookId)) {
                if (book.getStock() > 0) {
                    borrowedBooks.add(book);
                    book.setStock(book.getStock() - 1);
                    System.out.println("Book borrowed successfully.");
                } else {
                    System.out.println("Sorry, the book is currently out of stock.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }
}
