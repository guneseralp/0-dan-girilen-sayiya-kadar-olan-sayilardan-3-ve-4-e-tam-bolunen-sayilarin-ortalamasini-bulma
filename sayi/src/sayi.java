import java.util.Scanner;

public class sayi {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int k, adet=0, total=0;
        double ortalama;
        System.out.print("Sayiyi Giriniz: ");
        k= input.nextInt();
        for(int i=0; i<=k; i++){
            if(i % 3 ==0 && i % 4 == 0){
                total += i;
                adet++;
            }
        }
        ortalama= total/(adet-1);
        System.out.print("Tüm sayilarin Ortalamasi: "+ortalama);

    }
}
