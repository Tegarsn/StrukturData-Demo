import java.util.Scanner;

public class Kasir4 {
    public static void main(String[] args) {
        String[] Nama = new String[100];
        double[] Harga = new double[100];
        int[] itemjumlah = new int[100];
        int itemCount = 0;
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        double total = 0.0;
        while (running) {
            System.out.println("Program Kasir");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Hitung Total Harga");
            System.out.println("3. Cetak Struk Pembayaran");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int Pilihan = scanner.nextInt();
            scanner.nextLine(); // Clear the new line character
            switch (Pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Barang: ");
                    String name = scanner.nextLine();
                    System.out.print("Masukkan Harga Barang: ");
                    double harga = scanner.nextDouble();
                    System.out.print("Masukkan Jumlah Barang: ");
                    int jumlah = scanner.nextInt();
                    scanner.nextLine(); // Clear the new line character
                    Nama[itemCount] = name;
                    Harga[itemCount] = harga;
                    itemjumlah[itemCount]= jumlah;
                    itemCount++;
                    System.out.println("Barang berhasil ditambahkan.");
                    break;
                case 2:
                    total = 0.0;
                    System.out.println("Daftar Barang:");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println(Nama[i] + " - Rp" + Harga[i]);
                        total += Harga[i] * itemjumlah[i];
                    }
                    System.out.println("Total Harga: Rp" + total );
                    break;
                case 3:
                    System.out.println("======== Struk Pembayaran =======");
                    System.out.println("======== TOKO TEGAR JAYA ========");
                    System.out.println("Daftar Barang: Jumlah Barang: Harga Barang:");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println(Nama[i] + "\t\t" + itemjumlah[i] + "\t\tRp" + Harga[i]);
                    }
                    System.out.println("");
                    System.out.println("Total Harga: \t\t\tRp." + total);
                    System.out.println("=========TERIMA KASIH===========");
                    running = false;
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
