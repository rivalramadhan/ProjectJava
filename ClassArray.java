package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class ClassArray {
    public static void main(String[] args) {
        String nama[] = {"Ripall", "Dian","Ramadhan"};
        int usia[] = {12, 17, 18};
        for (int i = 2; i < nama.length ; i++) {
            System.out.println("nama saya = " +nama[0]);
            System.out.println("umur saya adalah = " + usia[1]);
        }
    
        ArrayList biodata = new ArrayList();
        biodata.add("Rivalino");
        biodata.add(17);
        biodata.add("Malang");
        
        System.out.println(biodata.get(2));
        
    }
}
