package com.egitim.part2;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Examples examples = new Examples();

//        System.out.println("Lütfen bir sayı giriniz");
//        Scanner scanner = new Scanner(System.in);
//        int input1 = scanner.nextInt();
//        System.out.println("Lütfen bir sayı daha giriniz");
//        int input2 = scanner.nextInt();
//        /*examples.multiply(input1 ,input2);
//
//        examples.divide(20, 5);*/
        //      examples.compare(input1 ,input2);
//        System.out.println("Lütfen bir sayı giriniz");
//        Scanner scanner = new Scanner(System.in);
//        int input1 = scanner.nextInt();
//        examples.printOddNumbers(input1);
//        System.out.println("Lütfen bir sayı giriniz");
//        Scanner scanner = new Scanner(System.in);
//        int input1 = scanner.nextInt();
//        examples.sum(input1);
//        int[] list1 = {10, 8, 3, 1, 10};
//        //examples.checkarray(list1);
//        System.out.println("Lütfen bir kelime yazınız");
//        Scanner scanner = new Scanner(System.in);
//        String input1 = scanner.next() ;
//        System.out.println( examples.reverseWord(input1));
//                System.out.println("Lütfen bir sayı giriniz");
//        Scanner scanner = new Scanner(System.in);
//        int input1 = scanner.nextInt();
//        examples.perimeter(input1);
        System.out.println("Lütfen bir taban sayı giriniz");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        System.out.println("Lütfen bir üs sayı giriniz");
        int input2 = scanner.nextInt();
        examples.PowerOfNumber(input1,input2);

    }
}


