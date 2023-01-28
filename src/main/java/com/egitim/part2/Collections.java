package com.egitim.part2;

import com.egitim.part1.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {
        int a = 5;

        int[] liste = new int[5]; // array definition [1, 5, 9, 4, 2]
        liste[0] = 1; // indexler her zaman 0 dan başlar.
        liste[1] = a;
        liste[2] = 9;
        liste[3] = 4;
        liste[4] = 2;

        int[][] matrix = new int[2][2]; // two dimension array
        matrix[0][0] = 3;
        /*
            [[],[],
             [],[],
             [],[]]
         */
        Student[][][][] arr = new Student[3][2][3][3];

        // array'ler istediğimiz kadar boyutlu olabilirler
        // Arrayler primitive veya wrapper objeler tutabilirler. Kendi içlerinde farklı tipte obje tutamazlar.
        // araylerde obje erişimi çok hızlıdır.
        // Array size'ları tanımlandıktan sonra değişemezler.
        // System.out.println(liste[3]);

        int[] liste2 = {10, 8, 3, 1, 7}; // array definition 2
        //liste2[0] = 5;
        //[5, 6, 7]
        for(int i = 0; i < 3; i++){
         //   System.out.println(liste2[i]);
        }

        for(int i = 0; i < liste2.length; i++){
            System.out.print(liste2[i] + " - ");
        }
        System.out.println();

        Arrays.sort(liste2);

        for(int x: liste2){
           System.out.print(x + " - ");
        }

        // ARRAYLIST

        // Arraylist'ler sadece wrapper tipte obje tutabilirler. Ve eğer istenirse kendi içlerinde farklı tipte veri tutabilirler.
        // Arraylist'ler arraylere göre daha gelişmiş metodlar sunarlar. Ama veriye erişim array'ler kadar hızlı değildir.
        // Arraylist'lerin size'ı dinamik olarak değişebilir.
        List aList = new ArrayList();
        aList.add(1); // Bu bir Integer int değil
        aList.add(3);
        aList.add("Merhaba");
        aList.add(new Student());

        List<String> aList2 = new ArrayList<>(); // Generic

        aList2.add("A");
        aList2.add("Hello");
        //aList2.add(new Student()); bunu yapamam

        System.out.println(aList2.size()); // arraylist uzunluğunu elde edebilirim.
        System.out.println(aList2.get(0));
        aList2.remove(1);





















    }
}
