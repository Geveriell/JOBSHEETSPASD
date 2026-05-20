package casemethod2;

import java.util.Scanner;

public class RoyalDelishMain07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Antrian07 antrian = new Antrian07();
        ListPesanan07 listPesanan = new ListPesanan07();

        int pilih;

        do {
            System.out.println("\n===== SISTEM ANTRIAN ROYAL DELISH 07 =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("No HP: ");
                    String hp = sc.nextLine();
                    antrian.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    NodePembeli07 dipanggil = antrian.hapusAntrian();

                    if (dipanggil != null) {

                        System.out.println("Pembeli atas nama "
                                + dipanggil.data.namaPembeli
                                + " dipanggil.");

                        System.out.print("Kode Pesanan: ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan: ");
                        String namaPesan = sc.nextLine();

                        System.out.print("Harga: ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        listPesanan.tambahPesanan(kode, namaPesan, harga);

                        System.out.println("Pesanan berhasil ditambahkan.");
                    }
                    break;
                    
                case 4:
                    listPesanan.cetakPesanan();
                    break;

                case 5:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak tersedia.");
            }

        } while (pilih != 5);
    }
}