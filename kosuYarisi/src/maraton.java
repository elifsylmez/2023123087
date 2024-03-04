//Elif Söylemez
//BİLGİSAYAR MÜHENDİSLİĞİ 1.SINIF
//Öğrenci NO = 2023123087
//ÖDEV 1.

public class maraton {
    public static void maraton(String[] args) {
        String[] katilimcilar = {"Kadir", "Gökhan", "Hakan", "Suzan","Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin","Deniz", "Gözde", "Anıl", "Burak",};
        int[] dereceler = {341, 273, 278, 329, 445, 402, 388, 270,243,334, 412, 393, 299, 343, 317, 265};
        System.out.println("1. =" + birinci(katilimcilar,dereceler) + " dk " );
        System.out.println("2. = " + ikinci(katilimcilar,dereceler) + " dk ");
        System.out.println("3. = " + ucuncu(katilimcilar,dereceler) + " dk ");
        grupla(dereceler);
    }
    public static String birinci(String[] isimler, int[] dereceler){
        int e = 0;
        String ogrenciler;
        for (int i = 0; i < dereceler.length - 1; i++) {
            for (int j = i + 1; j < dereceler.length; j++) {
                if (dereceler[i] > dereceler[j]) {
                    ogrenciler = isimler[i];
                    isimler[i] = isimler[j];
                    isimler[j] = ogrenciler;
                    e = dereceler[i];
                    dereceler[i] = dereceler[j];
                    dereceler[j] = e ;
                }
            }
        }
        return
                isimler[0] + " " + dereceler[0];
    }
    public static String ikinci (String[] isimler, int[] dereceler){
        birinci(isimler, dereceler);
        return isimler[1] + " " + dereceler[1];
    }
    public static String ucuncu (String[] isimler, int[] dereceler){
        ikinci(isimler, dereceler);
        return isimler[2] + " " + dereceler[2];
    }
    public static void grupla(int[] dereceler) {
        int dereceA = 0, dereceB = 0, dereceC = 0;
        for (int i = 0; i < dereceler.length; i++) {
            if (200 <= dereceler[i] && dereceler[i] <= 299)
                dereceA++;
            if (300 <= dereceler[i] && dereceler[i] <= 399)
                dereceB++;
            if (400 <= dereceler[i])
                dereceC++;
        }
        System.out.println("A -> " + dereceA);
        System.out.println("B -> " + dereceB);
        System.out.println("C -> " + dereceC);
    }

}