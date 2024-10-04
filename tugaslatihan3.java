import java.util.Scanner;

public class tugaslatihan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for brand, category, and size
        System.out.println("Masukkan merk sepatu (Specs/910/Ortus): ");
        String merk = input.nextLine();
        System.out.println("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = input.nextLine();
        System.out.println("Masukkan ukuran sepatu (36-40/40-44): ");
        String ukuran = input.nextLine();

        int harga = 0;

        // Determine the price based on the input
        if (merk.equalsIgnoreCase("Specs")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran.equals("36-40")) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran.equals("40-44")) {
                harga = 1200000;
            }
        } else if (merk.equalsIgnoreCase("910")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran.equals("36-41")) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran.equals("41-44")) {
                harga = 1800000;
            }
        } else if (merk.equalsIgnoreCase("Ortus")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran.equals("36-40")) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran.equals("40-44")) {
                harga = 1500000;
            }
        }

        // Output the price
        if (harga != 0) {
            System.out.println("Harga sepatu: " + harga);
        } else {
            System.out.println("Kombinasi merk, kategori, dan ukuran tidak ditemukan.");
        }
        
        input.close();
    }
}
