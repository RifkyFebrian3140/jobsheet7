import java.util.Scanner;
public class durasiParkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("\nMasukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid! Silakan masukkan 1, 2, atau 0.");
            }

        } while (jenis != 0);

        System.out.println("\n================== LAPORAN PARKIR ==================");
        System.out.println("\nTotal pembayaran parkir hari ini: Rp " + total);
        System.out.println("Terima kasih telah menggunakan layanan parkir kami!");
        System.out.println("\n=====================================================");
        
        sc.close();
    }
}