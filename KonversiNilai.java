/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KonversiNilai {
      public static void main(String[] args) {
            String nim, nama, matkul, prodi;
            int nilai = 0;
            String peringkat = "";
            Scanner inputan = new Scanner(System.in);
            System.out.println("Masukkan NIM = ");
            nim = inputan.nextLine();
            System.out.println("Masukkan Nama = ");
            nama = inputan.nextLine();
            prodi = nim.substring(3,5);
          switch (prodi) {
              case "52":
                  System.out.println("S1 - Teknologi Informasi");
                  break;
              case "31":
                  System.out.println("D3 - Sistem Informasi");
                  break;
              case "51":
                  System.out.println("S1 - Sistem Informasi");
                  break;
              default:
                  System.out.println("NIM tidak Terdaftar");
                  break;
             }
            System.out.print("Masukkan Mata Kuliah : ");
            matkul = inputan.nextLine();
            System.out.print("Masukkan Nilai mahasiswa : ");
            nilai = inputan.nextInt();
          if (nilai >= 85) {
            peringkat = "A";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 80) {
            peringkat = "A-";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 75) {
            peringkat = "B+";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 70) {
            peringkat = "B";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 65) {
            peringkat = "B-";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 60) {
            peringkat = "C+";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 55) {
            peringkat = "C";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 50) {
            peringkat = "C-";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai >= 45) {
            peringkat = "D";
            System.out.println("Grade nilai siswa : " + peringkat);
        } else if (nilai < 45) {
            peringkat = "E";
            System.out.println("Grade nilai siswa = " + peringkat);
        } else {
            System.out.println("Inputan anda tidak sesuai !");
        }
          switch (peringkat) {
            case "A":
                System.out.println("Sangat Memuaskan");
                break;
            case "A-":
                System.out.println("Sangat Memuaskan");
                break;
            case "B+":
                System.out.println("Memuaskan");
                break;    
            case "B":
                System.out.println("Memuaskan");
                break;    
            case "B-":
                System.out.println("Memuaskan");
                break;    
            case "C+":
                System.out.println("Cukup");
                break;    
            case "C":
                System.out.println("Cukup");
                break;    
            case "C-":
                System.out.println("Cukup");
                break;    
            case "D":
                System.out.println("Kurang");
                break;    
            case "E":
                System.out.println("Sangat Kurang");
                break;    
            default:
                break;
      }
  }
}
