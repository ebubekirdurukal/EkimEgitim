package com.egitim.proje;

public class Okul {

    private String isim;
    private Adres adres;
    private int ogrenciSayisi;


    //OOP, encapsulation

    /*
        Bizler, bir sınıf tanımladığımızda, o sınıfın field'larını hemen private tanımlarız,
        daha sonra getter ve setter metodları yardımıyla o field'ları KONTROLLÜ bir şekilde erişime
        açarız.

     */
    // getters, setters

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }
}
