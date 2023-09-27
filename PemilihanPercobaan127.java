import java.util.Scanner;
public class PemilihanPercobaan127 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka: ");
        angka = input27.nextInt();

        if (angka%2==0) {
            System.out.println("Angka "+angka+" bilangan genap");
        } else {
            System.out.println("Angka "+angka+" bilangan ganjil");
        }

        input27.close();
    }
}