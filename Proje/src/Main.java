import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int girilenSayi;
        int sayac = 0;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        int devamEt = 1;
        while (devamEt == 1) {
            System.out.print("Bir tamsayi giriniz: ");
            girilenSayi = scanner.nextInt();

            if (girilenSayi < 0 || girilenSayi > 100) {
                System.out.println("Gecersiz deger girdiniz! [0, 100] araliginda olmalidir.");
                continue;
            }

            toplam += girilenSayi;
            sayac++;

            if (girilenSayi > enBuyuk) {
                enBuyuk = girilenSayi;
            }

            if (girilenSayi < enKucuk) {
                enKucuk = girilenSayi;
            }

            System.out.print("Yeni bir deger girmek istiyor musunuz? [Evet icin 1, Hayır icin 0]: ");
            devamEt = scanner.nextInt();
        }

        if (sayac > 0) {
            double ortalama = (double) toplam / sayac;
            System.out.println("Toplam " + sayac + " değer girildi.");
            System.out.println("Max = " + enBuyuk);
            System.out.println("Min = " + enKucuk);
            System.out.println("Ortalama = " + ortalama);
        } else {
            System.out.println("Herhangi bir deger girilmedi.");
        }

        scanner.close();
    }
}
