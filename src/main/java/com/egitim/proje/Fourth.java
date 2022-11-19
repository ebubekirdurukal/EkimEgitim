package com.egitim.proje;

public class Fourth {
    public static void main(String[] args) {
        int a = 5;
        Student std1 = new Student(); // Student class'ından bir instance yarattım.
        // new keyword'ü değişkeni memory'e kaydeder.
        std1.ad = "Ebubekir";
        std1.soyad = "Durukal";
        std1.okulNo = 156;

        System.out.println("Öğrencinin adı: " + std1.ad);

        Student std2 = null;       // null değeri vardır.
        //System.out.println(std2.ad);
        Adres adres = new Adres();
        Okul okl = new Okul();
        okl.isim = "ODTU";
        okl.adres = adres;
        okl.ogrenciSayisi = 5000;

        std1.okul = okl;

        std1.okul.adres.sokakNo = 5;





        Student nedim = new Student();

        Teacher ahmet = new Teacher();
    }
}
