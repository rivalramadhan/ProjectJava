/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ASUS
 */
public class Fibonacci {
    
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int hasil = recursive(i);
            System.out.print(i == 4 ? hasil : hasil + ", ");
        }
        System.out.println("");
    }
            
public static Integer recursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
            return recursive(n - 1) + recursive(n - 2);
        }
}
