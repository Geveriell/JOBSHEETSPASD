package Pertemuan12;

import java.util.Scanner;

public class SLLMain07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SingleLinkedList07 sll = new SingleLinkedList07();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nData mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa07 mhs = new Mahasiswa07(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\n=== HASIL LINKED LIST ===");
        sll.print();

        sc.close();
    }
}