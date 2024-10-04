import java.util.Scanner;

public class tugaslatihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan bilangan pertama (bil1): ");
        int bil1 = input.nextInt();
        
        System.out.println("Masukkan bilangan kedua (bil2): ");
        int bil2 = input.nextInt();
        
        System.out.println("Masukkan bilangan ketiga (bil3): ");
        int bil3 = input.nextInt();
        
        int terbesar;

        // Menentukan bilangan terbesar tanpa operator logika
        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                terbesar = bil1;
            } else {
                terbesar = bil3;
            }
        } else {
            if (bil2 >= bil3) {
                terbesar = bil2;
            } else {
                terbesar = bil3;
            }
        }

        System.out.println("Bilangan terbesar adalah: " + terbesar);
        input.close();
    }
}
