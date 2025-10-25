import java.util.Scanner;
public class penjualantiketbioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namapembeli;
        int hargatiket = 50000, tottiketterjual = 0, jumlahtiket;
        double totharga, totpendapatan = 0;

     System.out.println("===== PENJUALAN TIKET BIOSKOP =====");
     System.out.print("Masukan Nama Pembeli (Ketik 'Selesai' Untuk Berhenti) : ");
     namapembeli = sc.nextLine();

     while (!namapembeli.equalsIgnoreCase("Selesai")) {

        System.out.print("Masukan Jumlah Tiket Yang Dibeli : ");
        jumlahtiket = sc.nextInt();
        sc.nextLine();

        if (jumlahtiket < 0) {
            System.out.println("Jumlah tiket Yang Di Beli tidak valid !!");
            continue;
        }

        totharga = hargatiket * jumlahtiket;

        if (jumlahtiket > 10) {
            hargatiket -= hargatiket * 0.15;

        } else if (jumlahtiket > 4) {
            hargatiket -= hargatiket * 0.10;
        }
        
        System.out.println("\n===== STRUK PEMBELIAN TIKET BIOSKOP =====");

        System.out.println("Nama Pembeli : " + namapembeli);
        if (jumlahtiket > 10) {
            System.out.println("Pelanggan Mendapatkan Diskon 15%");

        } else if (jumlahtiket > 4) {
            System.out.println("Pelanggan Mendapatkan Diskon 10%");

        }

        System.out.println((jumlahtiket > 4)? "Total Harga Setelah Diskon : " + totharga : "Total Harga : " + totharga);
        totpendapatan += totharga;
        tottiketterjual += jumlahtiket;

        System.out.print("\nMasukan Nama Pembeli (Ketik 'Selesai' Untuk Berhenti) : ");
        namapembeli = sc.nextLine();
     }

        System.out.println("\n===== LAPORAN PENJUALAN TIKET BIOSKOP =====");
        System.out.println("Total Tiket Terjual : " + tottiketterjual);
        System.out.println("Total Pendapatan : " + totpendapatan);
        System.out.println("===========================================");

    sc.close();
    }
}
