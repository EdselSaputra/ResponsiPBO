package inheritance;

import java.util.Scanner;

public class Student extends Person {
    private String nim;

    public Student(Scanner scanner) {
        super(scanner);
        System.out.println("Masukkan NIM anda: ");
        nim = scanner.nextLine();
    }

    public void bayar(Scanner scanner) {
        System.out.println("Masukkan tagihan SPP: ");
        int spp = scanner.nextInt();
        System.out.println("Masukkan tagihan SKS: ");
        int sks = scanner.nextInt();
        System.out.println("Masukkan tagihan Modul: ");
        int modul = scanner.nextInt();
        int total = spp + sks + modul;
        System.out.println("Total tagihan: " + total);
    }
}