package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Factorial {

    public static void main(String[] args) {
        int hasil = recursive(4);
        System.out.println(hasil);
    }
    
    public static Integer recursive(int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * recursive(n-1);
        }
    }  
}
