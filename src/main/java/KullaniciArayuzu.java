
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class KullaniciArayuzu extends JFrame {
    private Fabrika fabrika;
    private List<Musteri> musteriler;
    private List<Siparis> siparisler;

    public KullaniciArayuzu() {

        fabrika = new Fabrika();
        musteriler = new ArrayList<>();
        siparisler = new ArrayList<>();

        setTitle("Tofaş Otomobil Fabrikası");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(6, 2));

        JLabel modelLabel = new JLabel("Otomobil Modeli:");
        JTextField modelField = new JTextField();
        JLabel motorTipiLabel = new JLabel("Motor Tipi:");
        JTextField motorTipiField = new JTextField();
        JLabel yakitTuruLabel = new JLabel("Yakıt Türü:");
        JTextField yakitTuruField = new JTextField();
        JLabel beygirGucuLabel = new JLabel("Beygir Gücü:");
        JTextField beygirGucuField = new JTextField();
        JLabel adLabel = new JLabel("Ad:");
        JTextField adField = new JTextField();
        JLabel soyadLabel = new JLabel("Soyad:");
        JTextField soyadField = new JTextField();
        JLabel adresLabel = new JLabel("Adres:");
        JTextField adresField = new JTextField();

        JButton ekleButton = new JButton("Otomobil Ekle");
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model = modelField.getText();
                String motorTipi = motorTipiField.getText();
                String yakitTuru = yakitTuruField.getText();
                int beygirGucu = Integer.parseInt(beygirGucuField.getText());
                String ad = adField.getText();
                String soyad = soyadField.getText();
                String adres = adresField.getText();

                Otomobil otomobil = new Otomobil(model, motorTipi, yakitTuru, beygirGucu);
                fabrika.otomobilEkle(otomobil);

                Musteri musteri = new Musteri(ad, soyad, adres);
                musteriler.add(musteri);

                Siparis siparis = new Siparis(musteri, otomobil);
                siparisler.add(siparis);

                System.out.println("Motor Tipi: " + otomobil.getMotorTipi());
                System.out.println("Yakıt Türü: " + otomobil.getYakitTuru());
                System.out.println("Beygir Gücü: " + otomobil.getBeygirGucu());
                System.out.println("Müşteri Adı: " + musteri.getAd());
                System.out.println("Müşteri Soyadı: " + musteri.getSoyad());
                System.out.println("Müşteri Adresi: " + musteri.getAdres());
                System.out.println("Sipariş Durumu: " + siparis.getDurum());

                int cevap = JOptionPane.showConfirmDialog(null, "Yeni otomobil eklemek istiyor musunuz?", "Otomobil Ekle", JOptionPane.YES_NO_OPTION);
                if (cevap == JOptionPane.YES_OPTION) {
                    modelField.setText("");
                    motorTipiField.setText("");
                    yakitTuruField.setText("");
                    beygirGucuField.setText("");
                    adField.setText("");
                    soyadField.setText("");
                    adresField.setText("");
                } else {
                    dispose();
                }
            }
        });

        panel.add(modelLabel);
        panel.add(modelField);
        panel.add(motorTipiLabel);
        panel.add(motorTipiField);
        panel.add(yakitTuruLabel);
        panel.add(yakitTuruField);
        panel.add(beygirGucuLabel);
        panel.add(beygirGucuField);
        panel.add(adLabel);
        panel.add(adField);
        panel.add(soyadLabel);
        panel.add(soyadField);
        panel.add(adresLabel);
        panel.add(adresField);

        add(panel, BorderLayout.CENTER);
        add(ekleButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                new KullaniciArayuzu();
            }
        });


    }


}