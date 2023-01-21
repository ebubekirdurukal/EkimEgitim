package com.egitim.oop;

public class Inheritence {

    public static void main(String[] args) {
        Tester tst1 = new Tester();
        tst1.setName("Asli");
        tst1.setSurname("Temel");
        tst1.setFavouriteTestTool("Postman");
        tst1.calculateSalary();

        Sigortali sg1 =  new Sigortali();

        Developer developer = new Developer();
        developer.setName("Nedim");
        //developer.setFavouriteTestTool(); Yapamayız
        //Inheritence(Kalıtım) extends keyword'ü ile yapılır. Asıl amacı gereksiz tanımlardan kurtulmak ve sınıf hiyerarşisini oluşturmaktır.
        // Üst sınıflardaki metodlar alt sınıflarda override edilebilir. Metodu ezebiliriz.
        // Java'da bir sınıf sadece tek bir tane üst sınıfa sahip olabilir.(Extends deyip tek bir sınıf verebilirsiniz.)
        // Java'da class hiyerarşisinde en üstte Object sınıfı vardır. Her sınıf object sınıfından türer.
        // üst sınıflara superclass denir.
    }
}
