import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName = "TNCP", pw = "12345678";
        String inputUser, inputPw;

        System.out.print("Masukkan Username anda: ");
        inputUser = input.nextLine();
        System.out.print("Masukkan Password anda: ");
        inputPw = input.nextLine();

        if (inputUser.equals(userName) && inputPw.equals(pw)) {
            System.out.println("Anda masuk ke system!");
        } else {
            System.out.println("User dan password salah!");
        }

        input.close();
    }
}