import java.util.Scanner;

public class hitungTotalHarga18 {

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = hargaTotal - (hargaTotal / 2); 
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = hargaTotal - (hargaTotal / 3); 
        } else if (!kodePromo.equals("")) {
            System.out.println("Kode promo tidak valid.");
        }

        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int totalKeseluruhan = 0; 
        String kodePromo;

        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin anda pesan (0 untuk selesai): ");
            int pilihanMenu = input.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = input.nextInt();

            System.out.print("Masukkan kode promo (kosongkan jika tidak ada): ");
            input.nextLine(); 
            kodePromo = input.nextLine();


            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

            totalKeseluruhan += totalHarga;
            
            System.out.println("Total harga untuk pesanan ini: Rp" + totalHarga);
        }

        System.out.println("\nTotal keseluruhan pesanan Anda: Rp" + totalKeseluruhan);
    }
}
