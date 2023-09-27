import java.util.Scanner;
public class PemilihanPercobaan127 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka: ");
        angka = input27.nextInt();

        String output = (angka%2==0) ? "Angka "+angka+" bilangan genap" : "Angka "+angka+" bilangan ganjil";
        System.out.println(output);

        input27.close();
    }
}