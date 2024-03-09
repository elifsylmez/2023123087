

    public class Main {
        public static void main(String[] args) {
            Ogrenciler ogrenci1 = new Ogrenciler("Gökhan", "Bilgisayar Mühendisliği", 1985, 10);
            Ogrenciler ogrenci2 = new Ogrenciler("Ayşe", "Makine Mühendisliği", 1985, 10);
            Ogrenciler ogrenci3 = new Ogrenciler("Elif", "Elektrik-Elektronik Mühendisliği", 2020, 10, 1.98f);
            Ogrenciler ogrenci4 = new Ogrenciler(2020, 10);


            ogrenci1.olusturOgrNo();
            ogrenci2.olusturOgrNo();
            ogrenci3.olusturOgrNo();
            ogrenci4.olusturOgrNo();

            System.out.println("Öğrenci Bilgileri");

            System.out.println(
                    "OGR-1 " + ogrenci4.getİsim() + " " + ogrenci4.getBolum() + " " + ogrenci4.getOgrencino() + " " +
                            ogrenci4.getGano()
            );
            System.out.println(
                    "OGR-2 " + ogrenci1.getİsim() + " " + ogrenci1.getBolum() + " " + ogrenci1.getOgrencino() + " " +
                            ogrenci1.getGano()
            );
            System.out.println(
                    "OGR-3 " + ogrenci2.getİsim() + " " + ogrenci2.getBolum() + " " + ogrenci2.getOgrencino() + " " +
                            ogrenci2.getGano()
            );
            System.out.println(
                    "OGR-4 " + ogrenci3.getİsim() + " " + ogrenci3.getBolum() + " " + ogrenci3.getOgrencino() + " " +
                            ogrenci3.getGano()
            );

            System.out.println("3. Öğrencinin ödeyeceği harç: " + ogrenci1.harcHesapla(5));
            System.out.println("4. Öğrencinin ödeyeceği harç: " + ogrenci1.harcHesapla(5, 3));

        }

    }