package com.egitim.proje;

public class Asli {
    public static void main(String[] args) {
        int not = 75;
        if (not >= 85 && not <= 100)
            System.out.println("Tebrikler, A aldınız.");
        else if (not < 85 && not >= 75) {
            System.out.println("B aldınız");
        } else if (not < 75 && not >= 65) {
            System.out.println("C aldınız");
        }
    }
}

