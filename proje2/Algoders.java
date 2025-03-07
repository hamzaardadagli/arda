public class Algoders {
    int numara;
    String Ad;
    String Soyad;
    String Bolum;
    int Sinif;
    double vize_notu;
    double final_notu;
    double ortalama;
    String harfnotu;

    Algoders(int numara,String Ad,String Soyad,String Bolum, int Sinif,double vize_notu,double final_notu){
        this.numara = numara;
        this.Ad = Ad;
        this.Soyad = Soyad;
        this.Bolum = Bolum;
        this.Sinif = Sinif;
        this.vize_notu = vize_notu;
        this.final_notu = final_notu;



    }
    Algoders(int numara,String Ad,String Soyad){
        this.numara = numara;
        this.Ad = Ad;
        this.Soyad = Soyad;
    }
    void nothesapla(){
        ortalama = vize_notu*0.4+ final_notu*0.6;
    }
    void hafnnotuhesapla(){
        if (ortalama<50){
            harfnotu= "E";
        }
        else if (51<=ortalama && ortalama<60){
            harfnotu= "C";
        }
        else{
            harfnotu= "A";
        }

    }
}
