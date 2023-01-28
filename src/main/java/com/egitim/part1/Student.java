package com.egitim.part1;

public class Student {

    private String ad;          // objenin özellikleri(fields)

    private String takmaAd;
    private String soyad;       // bu field'lar öğrenciden öğprenciye değiştiği için static tanımlamıyoruz.
    private int okulNo;

    static String meslek = "Ogrenci"; // Mesle field'ı ise tüm öğrenciler için aynı olacağından static tanımlarım.

    Okul okul; // objelerin kompozisyonu


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public static String getMeslek() {
        return meslek;
    }

    public static void setMeslek(String meslek) {
        Student.meslek = meslek;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }


    /*
    Constructor metodları istisna bir metod tipidir.
    Dönüş tipi bulunmaz ve Metod ismi sınıf ismiyle aynı olmalıdır.
    Eğer bir sınıfta hiç constructor yok ise java parametresiz bir constructor arka planda otomatik yaratır.
    Ama eğer biz bir constructor metodu yazarsak, java artık o işi bize bırakır ve otomatik bir
    constructor metodu arka planda oluşturmaz
     */


    public Student() { // constructor. Bir nesneden instance yaratılmasının yolu bu metoddur.(İnşa eden metod)
    }

    public Student(String ad, String soyad, int okulNo, Okul okul) { // constructor
        this.ad = ad;               // Java'da this keyword'ü bulunulan sınıfı ifade eder.
        this.soyad = soyad;
        this.okulNo = okulNo;
        this.okul = okul;
    }

    // objenin fonksiyonu(yeteneği)
    public void calis(){
        System.out.println("Benim adım:" + this.getAd() + ", ben ders calisiyorum.");
    }

}
