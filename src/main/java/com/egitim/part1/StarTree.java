package com.egitim.part1;

public class StarTree {
    public static void main(String[] args) {
        /*
            *
           * *
          * * *
         * * * *
        * * * * *

         */

        for (int i = 1; i < 6; i++) {
            for (int k = 5 - i; k > 0; k--) { // azalan sayıda boşluk
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");       // artan sayıda yıldız
            }
            System.out.println();
        }
    }
}
