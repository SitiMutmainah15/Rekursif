import java.util.Scanner;

public class Tugas211 {
    static void DeretRekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " "); 
        DeretRekursif(n - 1);
    }

    static void DeretIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " "); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Bilangan n: ");
        int n = sc.nextInt();

        System.out.println();
        DeretRekursif(n); 

        System.out.println();
        DeretIteratif(n);
    }
}
