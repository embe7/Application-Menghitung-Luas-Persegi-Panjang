package learning;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// This Is Application Calculator Rectangle

        Scanner inputNilai = new Scanner(System.in);

        int panjang;
        int lebar;
        int hasil;

        System.out.println("===== Insert Large Rectangle ===== ");
        System.out.println("Insert Rectangle = " );
        System.out.print("Insert Long = ");
        panjang = inputNilai.nextInt();
        System.out.print("Insert Wide = ");
        lebar = inputNilai.nextInt();

        hasil = (panjang * lebar);

        System.out.println("Large Rectangle Is = " + hasil);
    }
}
