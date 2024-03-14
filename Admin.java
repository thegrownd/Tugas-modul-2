import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
    static String username = "admin";
    static String password = "admin";
    static List<Student> userStudent = new ArrayList();
    static Scanner scanner = new Scanner(System.in);

    public String username(){
        return username;
    }

    public String password(){
        return password;
    }

    public static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Enter faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter study program: ");
        String studyProgram = scanner.nextLine();

        Student newStudent = new Student(name, nim, faculty, studyProgram);
        userStudent.add(newStudent);

        System.out.println("Mahasiswa berhasil ditambahkan");
    }

    public static void displayStudent() {
        System.out.println("Registered Students:");
        for (Student student : userStudent) {
            System.out.println(student.getName() + " (" + student.getNim() + ")");
        }
    }
}
