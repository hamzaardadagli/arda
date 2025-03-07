public class Calendar2{
    public static void main(String[] args)throws InterruptedException {
        Calendar takvim1 = new Calendar(2015, 2, 9);

        while (true) {
            takvim1.ilerlet();
            Thread.sleep(1000);
            System.out.println("year: " + takvim1.year + " month: "+ takvim1.month + " day: " + takvim1.day);

        }

    }
}
