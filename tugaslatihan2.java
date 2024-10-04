import java.util.Scanner;

public class tugaslatihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jenis dan jumlah buku
        System.out.println("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = input.nextLine();
        System.out.println("Masukkan jumlah buku: ");
        int jumlahBuku = input.nextInt();

        double diskon = 0;

        // Hitung diskon berdasarkan jenis dan jumlah buku
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        System.out.println("Diskon yang didapatkan: " + (diskon * 100) + "%");
        
       
    }
}
