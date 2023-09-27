import java.util.Scanner;

public class PemilihanPercobaan227 {
    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        String huruf="", kualifikasi="";
        float setara=0;

        System.out.print("Nilai UAS\t: ");
        float uas = input27.nextFloat();
        System.out.print("Nilai UTS\t: ");
        float uts = input27.nextFloat();
        System.out.print("Nilai Kuis\t: ");
        float kuis = input27.nextFloat();
        System.out.print("Nilai Tugas\t: ");
        float tugas = input27.nextFloat();

        float total = (uas*0.4f)+(uts*0.3f)+(kuis*0.1f)+(tugas*0.2f);

        if (total > 80 && total <= 100) {
            huruf = "A";
            setara = 4;
            kualifikasi = "Sangat Baik";
        } else if (total > 73 && total <= 80) {
            huruf = "B+";
            setara = 3.5f;
            kualifikasi = "Lebih dari Baik";
        } else if (total > 65 && total <= 73) {
            huruf = "B";
            setara = 3;
            kualifikasi = "Baik";
        } else if (total > 60 && total <= 65) {
            huruf = "C+";
            setara = 2.5f;
            kualifikasi = "Lebih dari Cukup";
        } else if (total > 50 && total <= 60) {
            huruf = "C";
            setara = 2;
            kualifikasi = "Cukup";
        } else if (total > 39 && total <= 50) {
            huruf = "D";
            setara = 1;
            kualifikasi = "Kurang";
        } else {
            huruf = "E";
            setara = 0;
            kualifikasi = "Gagal";
        }

        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir\t= "+total+" atau "+huruf+" setara "+setara+" kualifikasi "+kualifikasi+" sehingga "+message);

        input27.close();
    }
}