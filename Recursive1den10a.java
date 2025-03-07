public class Recursive1den10a {
    public static int Recursiveyaz(int n ){
        if(n==1){
            System.out.println(n);
            return 1;
        }
        System.out.println(n);
        return Recursiveyaz(n-1);


    }
    public static int RecursiveSum(int n){
        if(n==0){

            return 0;
        }
        int toplam=RecursiveSum(10);
        System.out.println(+toplam);

        return n+RecursiveSum(n-1);

    }
    //x in y.katını aldıran recursive fonksiyon
    public static int RecursiveUsalma(int x,int y){
        if(y==0){
            return 1;

        }
        return x*RecursiveUsalma(x,y-1);

    }
    //1 den n'e kadar olan çift sayıların toplamı
    public static int evensum(int n){
        if(n==0){
            return 0;

        }
        else if(n%2!=0){
            return evensum(n-1);//eğer n tek sayıysa n ile toplanmadan evenseum(n-1) cagırılır
        }
        return n+evensum(n-1);

    }
    //bir dizideki min elemanı bulmayı recursive ile yap
    public static int Recursivemin(int [] array,int index){
        if(index== array.length-1){
            return array[index];

        }
        int minrest =Recursivemin(array,index+1);
        return Math.min(array[index],minrest);


    }

}
