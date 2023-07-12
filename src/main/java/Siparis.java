public class Siparis {

    private Musteri musteri;
    private Otomobil otomobil;
    private String durum;

    public Siparis(Musteri musteri, Otomobil otomobil) {
        this.musteri = musteri;
        this.otomobil = otomobil;
        this.durum = "Sipariş alındı";
    }



    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public Otomobil getOtomobil() {
        return otomobil;
    }

    public void setOtomobil(Otomobil otomobil) {
        this.otomobil = otomobil;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }
}
