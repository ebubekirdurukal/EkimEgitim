package com.egitim.proje2;

import com.egitim.proje.Student;

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
        System.out.println("Lütfen bir sayı giriniz");
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        examples.printOddNumbers(input1);
    }
}


