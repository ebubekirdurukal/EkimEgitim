package com.egitim.proje;

public class Fourth {
    public static void main(String[] args) {
        int a = 5;
        Student std1 = new Student(); // Student class'ından bir instance yarattım.
        // new keyword'ü değişkeni memory'e kaydeder.
        std1.ad = "Ebubekir";
        std1.soyad = "Durukal";
        //std1.okulNo = 156;
        std1.setOkulNo(156); // artık böyle yapacağız

        System.out.println("Öğrencinin adı: " + std1.ad);

        Student std2 = null;       // null değeri vardır.
        //System.out.println(std2.ad);
        Adres adres = new Adres();
        Okul okl = new Okul();
        //okl.isim = "ODTU";
        okl.setIsim("ODTU");
        //okl.adres = adres;
        okl.setAdres(adres);
        //okl.ogrenciSayisi = 5000;
        okl.setOgrenciSayisi(5000);

        std1.okul = okl;

        // std1.okul.adres.sokakNo = 5;
        std1.getOkul().getAdres().sokakNo = 5;

        Student nedim = new Student();
        // nedim.okulNo = 12;
        nedim.setOkulNo(12);
        nedim.ad = "Nedim";
        nedim.soyad = "Temel";
        nedim.okul = okl;

        Student nedim2 = new Student("nedim", "Temel", 12, okl);


    }
}
