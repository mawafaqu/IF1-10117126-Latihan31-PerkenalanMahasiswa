/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117126.latihan31.perkenalanmahasiswa;

import java.util.Scanner;

/**
 *
 * @author Nama : Mawa Faqu Rochman 
 * Kelas : IF-1 
 * NIM :10117126 
 * Deskripsi Program: Program ini berisi program yang menampilkan data untuk 
 * mengenalkan beberapa siswa
 */
public class IF110117126Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa mahasiswa1 = new mahasiswa();
        mahasiswa1.nim = "10117126";
        mahasiswa1.nama= "Mawa Faqu Rochman" + "\n";
        mahasiswa1.PerkenalanDiri(mahasiswa1.nim, mahasiswa1.nama);
        
        mahasiswa mahasiswa2 = new mahasiswa();
        mahasiswa2.nim = "10117127";
        mahasiswa2.nama= "Kevin" + "\n";
        mahasiswa2.PerkenalanDiri(mahasiswa2.nim, mahasiswa2.nama);
        
        mahasiswa mahasiswa3 = new mahasiswa();
        mahasiswa3.nim = "10117128";
        mahasiswa3.nama= "Steve" + "\n";
        mahasiswa3.PerkenalanDiri(mahasiswa3.nim, mahasiswa3.nama);
        
        mahasiswa mahasiswa4 = new mahasiswa();
        mahasiswa4.nim = "10117129";
        mahasiswa4.nama= "lala" + "\n";
        mahasiswa4.PerkenalanDiri(mahasiswa4.nim, mahasiswa4.nama);
    }       

}
