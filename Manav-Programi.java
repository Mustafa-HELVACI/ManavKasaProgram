import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz=0.95, patlican=5;
        double armutMiktari, elmaMiktari, domatesMiktari, muzMiktari, patlicanMiktari;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutMiktari = input.nextDouble();

        Scanner inputB = new Scanner(System.in);
        System.out.print("Elma Kaç Kilo ? :");
        elmaMiktari = input.nextDouble();

        Scanner inputC = new Scanner(System.in);
        System.out.print("Domates Kaç Kilo ? :");
        domatesMiktari = input.nextDouble();

        Scanner inputD = new Scanner(System.in);
        System.out.print("Muz Kaç Kilo ? :");
        muzMiktari = input.nextDouble();

        Scanner inputE = new Scanner(System.in);
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanMiktari = input.nextDouble();


        double toplamTutar;
        toplamTutar = (elma*elmaMiktari)+(armut*armutMiktari)+(domates*domatesMiktari)+(muz*muzMiktari)+(patlican*patlicanMiktari);
        System.out.println("Toplam Tutar: " + toplamTutar + " ₺");



    }
}
