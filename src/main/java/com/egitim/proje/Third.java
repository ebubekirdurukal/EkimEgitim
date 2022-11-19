package com.egitim.proje;

public class Third {

    public static void main(String[] args) {
        // simple for loop
        for (int i = 0; i < 10; i++) {
            // System.out.println("merhaba");
        }
        int[] arr = {1, 2, 3};

        // enhanced for loop
        for(int i : arr){
            System.out.println(i);
        }

//        for(;;){
//            System.out.println("Merhaba"); // Sonsuz döngü
//        }

        // çarpım tablosu yazdırma
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++){
//                System.out.print(i * j + " - ");
//            }
//            System.out.println();
//        }

        // Star-tree practice

        // break;
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++){
//                if(j == 5){
//                    break; // içinde bulunduğu döngüyü kırar
//                }
//                System.out.print(i * j + " - ");
//            }
//            System.out.println();
//        }

//        for(int i = 1; i <= 10; i++){
//            if(i == 3){
//                break;  // dıştaki döngüyü kırıyor
//            }
//            for(int j = 1; j <= 10; j++){
//                System.out.print(i * j + " - ");
//            }
//            System.out.println();
//        }

//        test:
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++){
//                if(j == 5){
//                    break test; // verilen isimdeki döngüyü kırar
//                }
//                System.out.print(i * j + " - ");
//            }
//            System.out.println();
//        }
        // Complexity
        // kodun(algoritmanın) aldığı inputa nazaran ne kadar sürede çalıştığının ölçüsüdür.
        // O()
        /*
                    for(int i = 0; i < 10; i++){
                    System.out.println("merhaba"); O(n)
                    }
                    İç içe iki for'da O(n^2)
                    iç içe 3 for olursa O(n^3)

         */

        // continue
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++){
//                if(j == 3){
//                    continue; // o adımdaki geri kalan işlemleri yapmadan içinde bulunduğu döngünün bir sonraki adımına geç.
//                }
//                System.out.print(i * j + " - ");
//            }
//            System.out.println();
//        }
//
//        deneme:
//        for(int i = 1; i <= 10; i++){
//            for(int j = 1; j <= 10; j++){
//                if(j == 3){
//                    continue deneme; // o adımdaki geri kalan işlemleri yapmadan içinde ismi verilen döngünün bir sonraki adımına geç.
//                }
//                System.out.print(i * j + " - ");
//            }
//            System.out.println();
//        }

        // bizler break ve continue kullanarak döngülerin gidişatını değiştirebiliriz.


        // while
//        int a = 11;
//        while (a <= 10) {
//            System.out.println(a);
//            a++;
//        }
        // do-while
        int b = 1;
        do {
            System.out.println(b); // ne olursa olsun en az 1 kez çalışır
            b++;
        } while (b <= 10);
    }


}
