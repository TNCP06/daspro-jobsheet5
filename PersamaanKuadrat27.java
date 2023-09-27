import java.util.Scanner;
public class PersamaanKuadrat27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, x, x1, x2;

        System.out.print("Masukkan nilai a: ");
        a = input.nextDouble();
        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();

        d = (b*b)-(4*a*c);

        if (a == 0) {
            x = -(c/b);
            System.out.println("x: "+x);
        } else if (d < 0) {
            double real = (-b)/(2*a);
            double imajiner = Math.sqrt(-d)/(2*a);
            System.out.println("Bilangan Imajiner!");
            System.out.println("x1: "+real+" + "+imajiner+"i");
            System.out.println("x2: "+real+" - "+imajiner+"i");
        } else {
            x1 = (-b+Math.sqrt(d))/(2*a);
            x2 = (-b-Math.sqrt(d))/(2*a);

            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }
        input.close();
    }
}