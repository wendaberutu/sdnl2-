/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pohonBinary;

import java.util.Scanner;

public class mainTree {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner my = new Scanner(System.in);
        tree panggil = new tree();
        int[] array = { 56, 30, 40, 22, 70, 95, 60, 65, 11, 16, 63, 67, 3, 37, 88};
        for (int j : array){
            panggil.insert(j); 
        }
//
//        panggil.insert(42);
//        panggil.insert(21);
//        panggil.insert(38);
//        panggil.insert(27);
//        panggil.insert(71);
//        panggil.insert(82);
//        panggil.insert(55);
//        panggil.insert(63);
//        panggil.insert(6);
//        panggil.insert(2);
//        panggil.insert(40);
//        panggil.insert(12);

        System.out.println("data preOrder ");
        panggil.preOrder();
        System.out.println(" ");
        System.out.println("root =" + panggil.getRoot().getKey());
        System.out.println("masukkan nilai yang dicari ");
        int nilai = my.nextInt();
        treeNode kunci = panggil.search(nilai);
        System.out.println("data yang di cari adalah " + nilai);
        if (kunci != null) {
            System.out.println("data di temukan ");
        } else {
            System.out.println("data tidak di temukan");
        }

    }

}
