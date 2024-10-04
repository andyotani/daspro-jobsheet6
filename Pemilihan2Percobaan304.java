import java.util.Scanner;

public class Pemilihan2Percobaan304 {
    public static void main(String[] args) {
        Scanner inputAbsen04 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        // Input kategori dan penghasilan
        System.out.println("Masukkan Kategori : ");
        kategori = inputAbsen04.nextLine();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = inputAbsen04.nextInt();

        // Logika kategori "pekerja"
        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
        // Logika kategori "pebisnis"
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
        } else {
            System.out.println("Masukkan Kategori Salah");
            inputAbsen04.close();
            return;
        }

        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.println("Penghasilan Bersih = " + gajiBersih);

       
    }
}
