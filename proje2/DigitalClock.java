

public class DigitalClock {
    int saat;
    int dakika;
    double saniye;
    DigitalClock(int saat, int dakika, double saniye) {
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }
    void zamanilerlet() {
        saniye++;
        if (saniye == 60) {
            saniye = 0;
            dakika++;
        } else if (dakika == 60) {
            dakika = 0;
            saat++;

        } else if (saat == 24) {
            saat = 0;

            System.out.println(saat + " " + dakika + " " + saniye);


        }
    }


}
