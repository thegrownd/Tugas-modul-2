import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Book[] bookList;
    private static List<Student> userStudent;
    private static Scanner scanner;

    public static void main(String[] args) {
        Main library = new Main();
        library.menu();
    }

    public Main() {
        scanner = new Scanner(System.in);
        bookList = new Book[]{
                new Book("1", "Sejarah", "Bapak legend", "A", 1),
                new Book("2", "Kimia", "Mrs enung mulyati", "B", 2),
                new Book("3", "Matematika", "pak eko", "C", 3),
                new Book("4", "Biologi", "Pak rusmala", "D", 4)
        };


        userStudent = new ArrayList();
        userStudent.add(new Student("Bapak Legend", "089561896025432", "Teknik", "Informatika"));
        userStudent.add(new Student("Yazid", "202310370311396", "Teknik", "Informatika"));
        userStudent.add(new Student("Backflip", "123456789012345", "Teknik", "Informatika"));
    }

    public void menu() {
        int choice;
        do {
            System.out.println("Library System");
            System.out.println("1. Login sebagai Mahasiswa");
            System.out.println("2. Login sebagai Admin");
            System.out.println("3. Exit");
            System.out.print("Masukkan pilihan: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputNim();
                    break;
                case 2:
                    System.out.print("Masukkan id : ");
                    String username = scanner.next();
                    System.out.print("Masukkan password : ");
                    String password = scanner.next();

                    if (username.equals(Admin.username) && password.equals(Admin.password)) {
                        System.out.println("Login berhasil.");
                        menuAdmin();
                    } else {
                        System.out.println("Nama pengguna atau kata sandi salah.");
                    }
                    break;
                case 3:
                    System.out.println("keluar");
                    break;
                default:
                    System.out.println("Bro? kok salah");
            }
        } while (choice != 3);
    }

    public static void menuStudent(String nim) {
        int choice = 0;

        do {
            System.out.println("Student Menu");
            System.out.println("1. List buku");
            System.out.println("2. List pinjaman");
            System.out.println("3. Pinjam buku");
            System.out.println("4. Logout");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Student.displayBooks(bookList);
                    break;
                case 2:
                    for (Student student : userStudent) {
                        student.displayBorrowedBooks();
                    }
                    break;
                case 3:
                    for (Student student : userStudent) {
                        student.borrowBook(bookList);
                    }
                    break;
                case 4:
                    System.out.println("keluar dari akun mahasiswa");
                    break;
                default:
                    System.out.println("");
            }
        } while (choice != 4);
    }

    public static void inputNim() {
        System.out.println("Masukkan nim mu: ");
        scanner.nextLine();
        String nim = scanner.nextLine();
        checkNim(nim, 1);
    }

    public static void checkNim(String nim, int i) {
        boolean found = false;
        for (Student student : userStudent) {
            if (student.getNim().equals(nim)) {
                found = true;
                menuStudent(nim);
                break;
            }
        }
        if (!found) {
            System.out.println("mahasiswa dengan NIM " + nim + " tidak ditemuka");
        }
    }

    public void menuAdmin() {
        Admin admin = new Admin();
        Book Book = new Book();
        int choice;
        do {
            System.out.println("Admin Menu");
            System.out.println("1. Add Student");
            System.out.println("2. Display Registered Students");
            System.out.println("3. Logout");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    admin.addStudent();
                    break;
                case 2:
                    admin.displayStudent();
                    break;
                case 3:
                    System.out.println("loggout bro");
                    break;
                default:
                    System.out.println("Kok bisa salah");
            }
        } while (choice != 3);
    }
}
