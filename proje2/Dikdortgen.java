public class Dikdortgen {
    int width;
    int height;

    Dikdortgen(){
        this.width = 0;
        this.height = 0;
    }

    Dikdortgen(int width, int height) {
        this.width = width;//BURADAKİ WİDTH DEĞİŞKENİNİN BUNA EŞİTLİYOR
        this.height = height;//BURADAKİ HEİGHT DEĞİŞKENİNİN BUNA EŞİTLİYOR
    }
     int cevrehesaplama(){//static olmayanlar class adı ile çağırılamaz modele aittir
        return 2*height +2*width;
    }
    int alanhesap(){
        return width*height;
    }
}
