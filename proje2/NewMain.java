public class NewMain {
    public static void main(String[] args) {
        Dikdortgen d1 =new Dikdortgen(50,100);
        //DİKDÖRTGEN TİPİNDE BİR D1 NESNESİ OLUŞUTURULDU
        System.out.println("dikdortgenin yuksekliği:"+d1.height+"ve genisliği:"+d1.width);
        int cevre = d1.cevrehesaplama();
        int alan =d1.alanhesap();
        System.out.println("d1 dikdortgenin cevresi:"+cevre+" ve alanı:"+alan);



        Dikdortgen d2 =new Dikdortgen();
        int cevre2=d2.cevrehesaplama();
        int alan2=d2.alanhesap();
        System.out.println("d2 dikdortgenin cevresi:"+cevre+"ve alanı:"+alan);
        d2.height=40;
        d2.width=60;
        int cevre3=d2.cevrehesaplama();
        int alan3=d2.alanhesap();

        System.out.println("d2 dikdortgenin yüksekliği:"+d2.height+" ve genişiliği:"+d2.width);
        System.out.println("dikdörtgenin alanı:"+alan3);
        System.out.println("dikdortgenin cevresi:"+cevre3);

        Dikdortgen d3 =new Dikdortgen();







    }
}
