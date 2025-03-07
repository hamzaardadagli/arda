public class AlgoStudent {
    public static void main(String[] args) {
        Algoders student1=new Algoders(20042205,"Arda","Dagli","Yazılım Mühendisliği",2,65,75);
        System.out.println("ogrenci1 ad = " +student1.Ad +  " ogrenci1 soyad =" +student1.Soyad);
        student1.nothesapla();
        student1.hafnnotuhesapla();
        System.out.println(student1.numara+" ya ait ortalaması: " + student1.ortalama+ "  ve harf notu : " +student1.harfnotu);



        Algoders student2=new Algoders(20042206,"Ardacan","Dagli");
        System.out.println("ogrenci2 ad : "+student2.Ad+ " ogrenci2 soyad : " +student2.Soyad);
        student2.vize_notu=25; student2.final_notu=75;
        student2.nothesapla();
        student2.hafnnotuhesapla();
        System.out.println(student2.Ad +" "+student2.Soyad+ " ortalaması :" +student2.ortalama + " harf notu : "  + student2.harfnotu);
    }


}
