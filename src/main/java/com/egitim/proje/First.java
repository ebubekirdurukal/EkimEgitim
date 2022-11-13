package com.egitim.proje;

public class First {

    // bu bir one line comment line'dır

    /*
        Bu bir
        multiline comment line'dır(açıklama satırı)
     */

    /**
     * @date October 22nd 2022
     * @author Ebubekir Durukal
     * @param args
     * Bu bir Javadoc yorum bölümüdür.
     */
    public static void main(String[] args) {  // main kısayolu
//        System.out.println("Merhaba Dünya");  // sout kısayolu
//        System.out.println("bu da ikinci yazdığım kod");
//        System.out.println("bu da üçüncü yazdığım kod");
//        System.out.print("Merhaba Dünya"); // bir alt satıra inmez
//
//
//        System.out.println("bu satırı ben yeni bir branchte yazıyorum.");
//        System.out.println("bu satırın 25. satırda olması kesinlikle gerekli.");
//        System.out.println("bu satırın 26. satırda olması kesinlikle gerekli.");
//
//        System.out.println("bu satır olsa da olur olmasada olur.");
//        System.out.println("bu satır başka bir geliştirme");
//        System.out.println("bu kod yeni geldi");
//        System.out.println("bu kod yeni geldi 2");
//        System.out.println("ebubekir durukal bu kodu yazdı");
//        System.out.println("Nedim bu kodu yazdı");


        // primitive types
        byte a = 12; // -128 ve +127 arasındaki değerleri tutabilir. 8 bit 1 byte tır.
        short b = 33;
        int c = 444; // 64 küsür milyon değer alabilir.
        long d = 1200;
        char e = 'r';
        double f = 1.2;
        float h = 1.13f;
        boolean bl = true; // 1 bit
        // Java %100 object oriented bir değildir. Çünkü 8 tane obje olamayan temel tip barındırır.

        int cebimdekiPara = 50; // doğru tanım
        // derlenmez çünkü sayı ile değişken ismi başlamaz:  int 5para = 50;
        // derlenmez çünkü farklı karakter kullanılmaz int denem*me = 35;
        int para5 = 50; // yapılabilir.
        // standarda uygun değil int Para = 69;


        // Type casting
        int i = 65;
        int j = i;
        //System.out.println(i);
        long ln = i; // yapabilirim.
        i = (int) ln; // casting yapmak gerekir. Çünkü büyük kutudan küçük kutuya geçiyoruz.

        int it = 400;
        byte by = 0;
        // int içindeki değeri byte içerisinde tutmak istiyorum.
        it = by;
        by = (byte) it;
        System.out.println(by); // Casting yaparken memory e dikkat etmemiz gerekiyor. Yoksa taşma olur.

        // + işlemi
        int p = 3 + 5; // toplama p = 8
        int m = p + 1; // toplama m = 9
        int n = p + m; // n = 17
        String str = "Programming";
        String str2 = "Language";
        String str3 = str + str2; //  birleştirme
        System.out.println(str3); // ProgrammingLanguage
        System.out.println(str + " " + str2); // Programming Language
        System.out.println(n + p);
        System.out.println(str + str2 + n + p); // ProgrammingLanguage178
        System.out.println(n + p + str + str2); // 25ProgrammingLanguage
        // Java eğer + işareti bir string ile başlarsa geri kalanları da string olarak çevirir.

        // int x, y, z; tavsiye edilmez.



        System.out.println(p);





    }



}
