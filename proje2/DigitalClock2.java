public class DigitalClock2 {
    public static void main(String[] args) throws InterruptedException {

        DigitalClock saat1 = new DigitalClock(14, 35, 30);
        System.out.println("saat: " + saat1.saat + "dakika " + saat1.dakika + " saniye: " + saat1.saniye);
        saat1.zamanilerlet();
        System.out.println("saat: " + saat1.saat + "dakika: " + saat1.dakika + " saniye: " + saat1.saniye);


        while (true) {
            saat1.zamanilerlet();
            Thread.sleep(1000);
            System.out.println("saat: " +saat1.saat +" dakika: "+saat1.dakika+" saniye: "+saat1.saniye);
        }


    }


    }

