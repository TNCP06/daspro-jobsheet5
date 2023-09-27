import java.util.Scanner;

public class PemilihanPercobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);

        System.out.print("Nilai UAS\t: ");
        float uas = input27.nextFloat();
        System.out.print("Nilai UTS\t: ");
        float uts = input27.nextFloat();
        System.out.print("Nilai Kuis\t: ");
        float kuis = input27.nextFloat();
        System.out.print("Nilai Tugas\t: ");
        float tugas = input27.nextFloat();

        float total = (uas*0.4f)+(uts*0.3f)+(kuis*0.1f)+(tugas*0.2f);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir\t= "+total+" sehingga "+message);

        input27.close();
    }
}