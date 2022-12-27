/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;


public class Bubblesort {
    public static void main(String[] args) {
        int value[] = {5, 3, 1, 2, 4};
        bubblesort(value);
        
    }
    public static void bubblesort (int[] numbers) {
        
//        before sorting
        System.out.println("==Before Sorting==");
        for (int num : numbers) {
            System.out.print(num + ", ");        
        }
        
//        logical bubble sort
         for (int i = 0; i < numbers.length; i++) {
                for (int j = 0; j < numbers.length - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        int n = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = n;
                 }
             }
         }
        
//        after sorting
        System.out.println("");
        System.out.println("\n==After Sorting==");
        for (int num : numbers) {
            System.out.print(num + ", ");
            
        
        }
    }
}
//endclass