import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat, kdv, kdvTutari;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz: ");


        fiyat = input.nextFloat();
        System.out.println("KDV'siz Fiyat: "+ fiyat);

        kdv = (fiyat >= 1000) ? 0.08 : 0.18;
        kdvTutari = fiyat * kdv;
        fiyat += kdvTutari;

        System.out.println("Ürünün KDV Dahil Fiyatı : " + fiyat );
        System.out.println("KDV Tutarı : " + kdvTutari );
        System.out.println("KDV Oranı : " + kdv );

    }
}