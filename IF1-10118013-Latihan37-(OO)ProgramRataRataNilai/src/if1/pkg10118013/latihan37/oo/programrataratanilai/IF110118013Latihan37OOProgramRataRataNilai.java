/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan37.oo.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menghitung Rata-Rata Nilai dari beberapa Mahasiswa
 */
public class IF110118013Latihan37OOProgramRataRataNilai {
    public static int jumlahMahasiswa;
    public static double rataRata = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        jumlahMahasiswa = scanner.nextInt();
        for ( int i = 0; i < jumlahMahasiswa; i++){
            System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
            rataRata += scanner.nextInt();
        }
        rataRata /= jumlahMahasiswa;
        System.out.println("");
        System.out.println("Maka, Rata-rata Nilainya adalah " + rataRata);
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
