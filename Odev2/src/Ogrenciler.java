public class Ogrenciler {
    private String isim;
    private String bolum;
    private int girisyili;

    private float gano;
    private long ogrencino;
    private int bolumkodu;


    public Ogrenciler(String bolum, int girisyili,int bolumkodu){
        setBolum(bolum);
        setGirisyili(girisyili);
        setBolumkodu(bolumkodu);
    }
    public Ogrenciler(String isim, String bolum, int girisyili){
        setİsim(isim);
        setBolum(bolum);
        setGirisyili(girisyili);
    }
    public Ogrenciler(int girisyili, int bolumkodu){

        setGirisyili(girisyili);
        setBolumkodu(bolumkodu);
    }
    public Ogrenciler(int girisyili, int bolumkodu, float gano){

        setGirisyili(girisyili);
        setBolumkodu(bolumkodu);
        setGano(gano);
    }
    public Ogrenciler(String isim, String bolum, int girisyili, int bolumkodu){
        setİsim(isim);
        setBolum(bolum);
        setGirisyili(girisyili);
        setBolumkodu(bolumkodu);
    }
    public Ogrenciler(String isim, String bolum, int girisyili, int bolumkodu, float gano){
        setİsim(isim);
        setBolum(bolum);
        setGirisyili(girisyili);
        setBolumkodu(bolumkodu);
        setGano(gano);
    }

    public void olusturOgrencino() {
        int rand = (int)(Math.random() * 99999) + 10000;
        String no = "" +girisyili + bolumkodu + rand;


        int cut = no.length() - 10;
        if(no.length() > 10){

            no = no.substring(0, no.length() - cut);
        }

        setOgrencino(Long.parseLong(no));

    }
    public float harcHesapla(int dersSayisi) {
        return (dersSayisi * 12.4f);
    }
    public float harcHesapla(int dersSayisi, int yil) {
        return (dersSayisi * yil * 12.4f);
    }

    public String getİsim() {
        return isim;
    }

    public void setİsim(String isim) {
        this.isim = isim;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getGirisyili() {
        return girisyili;
    }

    public void setGirisyili(int girisyili) {
        this.girisyili = girisyili;
    }

    public int getBolumkodu() {
        return bolumkodu;
    }

    public void setBolumkodu(int bolumkodu) {
        this.bolumkodu = bolumkodu;
    }

    public float getGano() {
        return gano;
    }

    public void setGano(float gano) {
        this.gano = gano;
    }

    public long getOgrencino() {
        return ogrencino;
    }

    public void setOgrencino(long ogrencino) {

        this.ogrencino = ogrencino;
    }


}





