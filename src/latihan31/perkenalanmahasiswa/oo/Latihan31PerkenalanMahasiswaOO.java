/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan31.perkenalanmahasiswa.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Program Mahasiswa Berbasis Object Oriented
 */
public class Latihan31PerkenalanMahasiswaOO {
    
    public String Nim;
    public String Nama;
   
    public static void main(String[] args) {
       PerkenalanDiri("10119036","Alfi Nurizkya");
       System.out.println();
       
       PerkenalanDiri("10110270","Indra Tiola");
       System.out.println();
       
       PerkenalanDiri("10110271","Robi Tanzil Genefi");
       System.out.println();
       
       PerkenalanDiri("10110265","Muhammad Nur Awaludin");
       System.out.println();
    }
       
    public static void PerkenalanDiri(String Nim, String Nama) {
        System.out.println("Hallo Everyone");
        System.out.println("My Nim Is " + Nim);
        System.out.println("My Name Is " + Nama);
    
    }
}
