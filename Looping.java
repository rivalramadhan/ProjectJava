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
public class Looping {
     public static void main(String[] args) {
        
         /*int i = 7;
         do {
             System.out.println(i);
             i++;    
         }
         while (i > 90);
            for (int i = 5;  i >= 5; i = i + 2){
                System.out.println(i);
                
            }*/
         /*Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Piramida Bintang ##");
    System.out.println("====================================");
    System.out.println();
     
    int tinggi_segitiga,i,j,k;
  
    System.out.print("Input tinggi segitiga: ");
    tinggi_segitiga = input.nextInt();
     
    System.out.println();
    
    for(i=1; i<=tinggi_segitiga; i++) {
  
      for(j=1; j<=tinggi_segitiga-i; j++) {
        System.out.print(" ");
      } 
      for(k=1; k<=i; k++) {
        System.out.print(" *");
      }
      System.out.println();
        }*/
         /*
         int nilaiawal, nilaiakhir,total = 0;
         Scanner input = new Scanner(System.in);
         System.out.print("Masukkan Nilai Awal : ");
         nilaiawal = input.nextInt();
         System.out.print("Masukkan Nilai Akhir : ");
         nilaiakhir = input.nextInt();
         
         while(nilaiawal <= nilaiakhir ){
             total = total + nilaiawal;
             System.out.println(" ditambah " + nilaiawal + " menjadi " + total );
             nilaiawal++;
         }*/
         
         for (int i = 5; i>=1; i--) {
             for (int j = i; j>=1 ; j--) {
                 System.out.print("*");
             }
            
             System.out.println("0");
         }
    
//    Scanner input = new Scanner(System.in);
//         System.out.print("masuk kan nilai awal :");
//         int pertama = input.nextInt();
//         System.out.print("Masukkan nilai akhir :");
//         int akhir = input.nextInt();
//         for (int i=pertama; i<=akhir; i++){
//             if (i%2==0)
//                 System.out.println(i);
//
//         }
//
         for(int i = 0; i<=5; i++) {
             for (int j = 0; j<4; j++){
                 System.out.print("*");
             }
             System.out.println("0");
         }

      
     }
}
