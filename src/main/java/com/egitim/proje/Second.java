package com.egitim.proje;

public class Second {

    public static void main(String[] args) {
        // >, <, &, |

        // mantıksal operatörler


        /* & and, ve
        a          b            çıktı
        true        false       false
        true        true        true
        false       false       false
        false       true        false
         */

                /* | or, veya
        a          b            çıktı
        true        false       true
        true        true        true
        false       false       false
        false       true        true
         */

        boolean a = false;
        boolean b = true;

        boolean c = a | b; // or
        boolean c1 = a || b; // kısa devre or. Compiler eğer ilk eleman true ise ifadenin geri kalanını okumayarak zaman optimizasyonu sağlar
        boolean d = a & b; // and
        boolean d1 = a && b; // kısa devre and. Compiler eğer ilk eleman false ise ifadenin geri kalanını okumayarak zaman optimizasyonu sağlar
        System.out.println(c);
        System.out.println(d);


        // IF
        int hesaptakiPara = 150;
        int gondermekIstediğimMiktar = 100;
        boolean bankOpen = true;
        int acilisSaati = 8;
        int kapanisSaati = 20;
        int suankiSaat = 16;

//        if (hesaptakiPara < gondermekIstediğimMiktar && bankOpen == true) {
//            System.out.println("Yeterli bakiyeniz bulunmamaktadır.");
//        }
//        boolean calismaSaatinde = (suankiSaat <= kapanisSaati) && (suankiSaat >= acilisSaati);
//        if ((hesaptakiPara > gondermekIstediğimMiktar) && (bankOpen) && (calismaSaatinde)) {
//            System.out.println("Para gönderebilirsiniz.");
//        }
//        if (bankOpen) {
//            System.out.println("banka açılınca işlem yapabilirsiniz.");
//        }


        // else-if
//        int not = 75;
//        if (not >= 85 && not <= 100) {
//            System.out.println("Tebrikler, A aldınız.");
//        } else if (not < 85 && not >= 75) {
//            System.out.println("B aldınız");
//        } else if (not < 75 && not >= 65) {
//            System.out.println("C aldınız");
//        }


        // switch-case
//        int deger = 1345;
//
//        if (deger == 3) {
//            System.out.println("Deger 3'tür");
//        } else if (deger == 2) {
//            System.out.println("Deger 2'dir");
//        } else if (deger == 1) {
//            System.out.println("Deger 1'dir");
//        } else {
//            System.out.println("başka bir değer");
//        }
//
//
//        switch (deger) {
//            case 1:
//                System.out.println("Deger 1'dir");
//                break;
//            case 2:
//                System.out.println("Deger 2'dir");
//                break;
//            case 3:
//                System.out.println("Deger 3'tür");
//                break;
//            default:
//                System.out.println("başka bir değer");
//                break;
//        }
        // switch case alt alta if else'ler ile nerdeyse aynı şeydir. Tek fark olarak bulunan değere direkt gider.

        // Tenary operator
        int not = 20;
        boolean sonuc = true;

        if (not < 50) {
            sonuc = false;
        } else {
            sonuc = true;
        }

        // eğer sadece bir tane if else im varsa ve bu if else içerisinde bir değişkene atama yapılıyorsa
        // tenary operatör kullanılabilir. Tenary operatörün performansı if-else ile aynıdır.

        sonuc = not < 50 ? false : true;
    }
}



