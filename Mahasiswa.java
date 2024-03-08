import java.util.Scanner;

public class Mahasiswa {
    public static String nama;
    public static String nim;
    public static String jurusan;

    public static String tampiluniversitas() {

        return "Universitas Muhammadiyah Malang";
    }

    public static void inputdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Masukkan Nim : ");
        nim = input.nextLine();

        System.out.print("Masukkan jurusan : ");
        jurusan = input.nextLine();

        if (nim.length() >= 15 && nim.length() <= 15) {
            System.out.println("Selamat, data berhasil ditambahkan");

        } else {
            System.out.println("NIM kurang atau lebih dari 15 digit");
        }
    }

    public static String tampildataMahasiswa() {
        return "Nama : " + nama + "\n NIM : " + nim + "\njurusan : " + jurusan;

    }
}











