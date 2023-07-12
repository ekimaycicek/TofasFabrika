import java.util.ArrayList;
import java.util.List;

public class Fabrika {

        private List<Otomobil> otomobiller;

        public Fabrika() {
            this.otomobiller = new ArrayList<>();
        }

        public void otomobilEkle(Otomobil otomobil) {
            otomobiller.add(otomobil);
            System.out.println("Yeni otomobil eklendi: " + otomobil.getModel());
        }

        public void uretimSuresi() {
            for (Otomobil otomobil : otomobiller) {
                parcalarinTemini(otomobil);
                montaj(otomobil);
                boyaIslemi(otomobil);
                kaliteKontrol(otomobil);
                System.out.println(otomobil.getModel() + " otomobilinin üretimi tamamlandı.");
            }
        }

        private void parcalarinTemini(Otomobil otomobil) {
            System.out.println(otomobil.getModel() + " otomobili için parçalar temin ediliyor...");
            // Parçaların temin işlemleri
        }

        private void montaj(Otomobil otomobil) {
            System.out.println(otomobil.getModel() + " otomobili montajlanıyor...");
            // Montaj işlemleri
        }

        private void boyaIslemi(Otomobil otomobil) {
            System.out.println(otomobil.getModel() + " otomobili boyanıyor...");
            // Boya işlemi
        }

        private void kaliteKontrol(Otomobil otomobil) {
            System.out.println(otomobil.getModel() + " otomobili kalite kontrolünden geçiriliyor...");
            // Kalite kontrol işlemleri
        }
    }


