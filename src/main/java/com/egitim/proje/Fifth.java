package com.egitim.proje;

public class Fifth {
    public static void main(String[] args) {
        Methods mtd = new Methods();
        //  bir sınıfın metodunu kullanmak için o sınıfın bir instance'ına ihtiyacım vardır.

        // System.out.println(mtd.topla(65, 3));
        //int sonuc = mtd.topla(4,10);
        //System.out.println(sonuc);

        Student ahmet  = new Student("ahmet", "beyaz", 12, new Okul());
        String isim = mtd.isimYazdir(ahmet);
        System.out.println(isim);

        int sonuc = mtd.ortalamaDondur(1, 2, 3);
        System.out.println(sonuc);
        System.out.println(mtd.maxNumber(30, 20));
        System.out.println(mtd.minNumber(3, 2));

        // methodlar bizim kod tekrarı yapmamızın önüne geçer
        mtd.drawTree(6);
        mtd.drawTree(3);
        mtd.drawTree(5);
        // static method'lar için bir sınıf instance'ına ihtiyacım yok. Direkt olarak
        // o sınıftan çağırabilirim. Çünkü static metodlar yapıları itibariyle instance'lara
        // göre değişmezler. Tüm instance'lar için aynıdır.
        Methods.staticDrawTree(3);

        //Student newStudent = new Student();
        //newStudent.calis();
        Student.calis();

        // sadece metodlar değil, değişkenler de static olabilir.
        // static olmayan değişkenlere erişim için soyut olan nesneden,
        // somut olan instance'lar yaratmalıyız.
        System.out.println(Student.meslek);
        Student s1 = new Student();
        s1.setAd("ali");
        //System.out.println(Student.);

    }
}
