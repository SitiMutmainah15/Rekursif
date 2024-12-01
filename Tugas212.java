import java.util.Scanner;

public class Tugas212 {
    static int hitungPenjumlahan(int n) {
        if (n == 1) { 
            return 1;
        } else {
            return n + hitungPenjumlahan(n - 1); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt(); 

        int hasil = hitungPenjumlahan(bilangan);

        System.out.println("Penjumlahan dari 1 sampai " + bilangan + " adalah: " + hasil);
    }
}
