import java.util.Scanner;

public class Pemilihan2Percobaan204 {
    public static void main(String[] args) {
        Scanner inputAbsen04 = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("==== MENU KAFE JTI =====");
        System.out.println("------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");

        int pilihan_menu = inputAbsen04.nextInt();
        inputAbsen04.nextLine();  // Mengambil newline setelah input angka

        System.out.print("Apakah punya member (y/n) ? = ");
        String member = inputAbsen04.nextLine();
        System.out.println("-----------------------------------");

        double diskon = 0.0;
        int harga = 0;

        // Kondisi jika pembeli memiliki member
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // Menghitung total bayar setelah diskon
            double total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } 
        // Kondisi jika pembeli tidak memiliki member
        else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; // Menghentikan eksekusi lebih lanjut jika pilihan salah
            }

            // Menghitung total bayar tanpa diskon
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("----------------------------------");
        inputAbsen04.close();
    }
}
