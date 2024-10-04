import java.util.Scanner;

public class Pemilihan2Percobaan104 {
    public static void main(String[] args) {
        Scanner inputAbsen04 = new Scanner(System.in);
        System.out.println("Masukkan tahun: ");
        int tahun = inputAbsen04.nextInt();

        // Menggunakan nested if tanpa operator logika
        if (tahun % 4 == 0) {
            if (tahun % 100 == 0) {
                if (tahun % 400 == 0) {
                    System.out.println("Tahun Kabisat");
                } else {
                    System.out.println("Bukan Tahun Kabisat");
                }
            } else {
                System.out.println("Tahun Kabisat");
            }
        } else {
            System.out.println("Bukan Tahun Kabisat");
        }

        inputAbsen04.close();
    }
}
