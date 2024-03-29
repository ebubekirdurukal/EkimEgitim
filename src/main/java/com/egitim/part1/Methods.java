package com.egitim.part1;

public class Methods {

    public static void main(String[] args) {

    }

    // metodlar Java'da bir sınıfın yeteneklerini belirleyen ve iş yapan kod parçalarıdır.
    // diğer dillerde fonksiyon diye de geçer

    // ilk ifade (int) metodun dönüş tipidir(çıktı tipi). Parantez içerisinde ise
    // metod parametreleri belirtilir.(İnputlar). İstediğimiz kadar ve 0 parametre koyabiliriz.
    // Not: Çok fazla parametreli metod yazmak kodun okunurluğunu azaltır.
    /*
    // Bir metodu tanımlarken
            1. access modifier yazılır.(zorunlu değil)
            2. dönüş tipi yazılır.(int, char, boolean, Student)
            3. metod ismi yazılır
            4. Parantez içerisinde metod parametreleri verilir
            5. süslü parantez içerisinde method gövdesi yazılır.(Method body)
     */
    public int topla(int x, int y) {
        int sonuc  =  x + y;
        return sonuc;
    }

    public int cikar(int x, int y) {
        return x - y;
    }

    public void yazdir() { // bu motodun dönüş tipi void'dir deriz. Ayrıca hiç bir parametre almamış
        System.out.println("merhaba");
    }

    // bir öğrencinin ismini yazdıran bir method yazınız.

    public String isimYazdir(Student student) {
        return student.getAd();
    }

    // üç sayının ortalamasını bulan bir metod yazınız

    public int ortalamaDondur(int a, int b, int c) {
        int toplam = a + b + c;
        int sonuc = toplam / 3;
        return sonuc;
        //int y = 5; return 'den sonra yeni bir kod yazamayız.
    }

    // iki sayıdan en büyük olanı yazdıran bir metod yazınız
    public int findMaximum(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a){
            return b;
        } else {
            return 0;
        }
    }
    public void findMaximum2(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else if (b > a){
            System.out.println(b);
        } else {
            System.out.println("ikisi eşittir");
        }
    }

    // iki sayıdan en küçük olanı yazdıran bir metod yazınız
    public int minNumber(int a, int b){
        return Math.min(a,b); // eğer min() metodu static olmasaydı bu şekilde çağıramazdım. Önce bir nesne yaratmam gerekirdi.
    }

    // istenilen uzunlukta ağaç çizdiren bir metod yazınız

    public void drawTree(int length){
        for (int i = 1; i < length; i++) {
            for (int k = 5 - i; k > 0; k--) { // azalan sayıda boşluk
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");       // artan sayıda yıldız
            }
            System.out.println();
        }
    }

    // static bir metod yazınız
    public static void staticDrawTree(int length){
        for (int i = 1; i < length; i++) {
            for (int k = 5 - i; k > 0; k--) { // azalan sayıda boşluk
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");       // artan sayıda yıldız
            }
            System.out.println();
        }
    }

    // access modifiers

}
