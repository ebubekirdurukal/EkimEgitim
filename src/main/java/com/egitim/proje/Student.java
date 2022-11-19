package com.egitim.proje;

public class Student {

    String ad;          // objenin özellikleri(fields)
    String soyad;
    int okulNo;

    Okul okul; // objelerin kompozisyonu

    // objenin fonksiyonu(yeteneği)
    public void calis(){
        System.out.println("Ders calisiyorum.");
    }

}
