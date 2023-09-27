import java.util.Scanner;
public class LatihanIndividu1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jarak;

        System.out.print("Masukkan jarak pertarungan: ");
        jarak = input.nextInt();

        if (jarak < 5) {
            System.out.println("Pertarungan jarak dekat menggunakan Melee weapon!");
        } else {
            System.out.println("Pertarungan jarak jauh menggunakan Ranged weapon!");
        }

        input.close();
    }
}