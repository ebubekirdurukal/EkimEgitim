package com.egitim.proje2;

public class Examples {

    /*
        1. Write a Java method to divide two numbers and print on the screen.
     */
    void divide(int a, int b) {
        double sonuc = a / b;
        System.out.println(sonuc);
    }


    /*
        2. Write a Java method that takes two numbers from user and display the product of two numbers.(Scanner)
     */
    void multiply(int a, int b) {
        int sonuc = a * b;
        System.out.println("Sonucunuz = " + sonuc);
    }

    /*
        3. Write a Java method to compare two numbers.
     */

    void compare(int a, int b) {
        if (a > b) {
            System.out.println(a + " büyüktür " + b);
        }
        else {
            System.out.println(b + " büyüktür " + a);
        }
    }


    /*
        4. Write a Java method to print the odd numbers from 1 to 99. Prints one number per line.
     */
    void printOddNumbers(int input1) {
        for (int i = 0; i < input1; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }





    /*
         5. Write a program to calculate the sum of first 10 natural number.
    */
    void sum(int input1) {
        int sum = 0;
        for (int i = 0; i <= input1; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    /*
        6. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
    */
    void checkArray(int[] list1) {

        if (list1[0] == list1[list1.length-1]){
            System.out.println("İlk ve son elemanlar esittir.");
        }
        else {
            System.out.println("İlk ve son elemanlar esit değildir.");
        }

    }

    /*
        7. Write a Java method to reverse a word.
    */

    public String reverseWord(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));
        }
        return reversed.toString();
    }


    /*
        8. Write a Java program to print the perimeter of a circle. (2*pi*r)
    */


    /*
          9. Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another.
     */

    /*
          10. Write a Java program to print the given array reversely.
     */
}
