public class Otomobil {

        private String model;
        private String motorTipi;
        private String yakitTuru;
        private int beygirGucu;


        public Otomobil(String model, String motorTipi, String yakitTuru, int beygirGucu) {
            this.model = model;
            this.motorTipi = motorTipi;
            this.yakitTuru = yakitTuru;
            this.beygirGucu = beygirGucu;

        }



        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMotorTipi() {
            return motorTipi;
        }

        public void setMotorTipi(String motorTipi) {
            this.motorTipi = motorTipi;
        }

        public String getYakitTuru() {
            return yakitTuru;
        }

        public void setYakitTuru(String yakitTuru) {
            this.yakitTuru = yakitTuru;
        }

        public int getBeygirGucu() {
            return beygirGucu;
        }

        public void setBeygirGucu(int beygirGucu) {
            this.beygirGucu = beygirGucu;
        }
    }


