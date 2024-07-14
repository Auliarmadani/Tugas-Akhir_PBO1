import java.util.ArrayList;
import java.util.Scanner;

class ResepMieAyam {
    String nama;
    String bahan;
    String langkah;

    ResepMieAyam(String nama, String bahan, String langkah) {
        this.nama = nama;
        this.bahan = bahan;
        this.langkah = langkah;
    }

    @Override
    public String toString() {
        return "Nama Resep: " + nama + "\nBahan: " + bahan + "\nLangkah: " + langkah + "\n";
    }
}

public class AplikasiMieAyam {
    private ArrayList<ResepMieAyam> daftarResep;

    public AplikasiMieAyam() {
        daftarResep = new ArrayList<>();
    }

    public void tambahResep(String nama, String bahan, String langkah) {
        ResepMieAyam resep = new ResepMieAyam(nama, bahan, langkah);
        daftarResep.add(resep);
        System.out.println("Resep berhasil ditambahkan!");
    }

    public void tampilkanResep() {
        if (daftarResep.isEmpty()) {
            System.out.println("Tidak ada resep mie ayam saat ini.");
        } else {
            for (ResepMieAyam resep : daftarResep) {
                System.out.println(resep);
            }
        }
    }

    public static void main(String[] args) {
        AplikasiMieAyam app = new AplikasiMieAyam();
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Resep Mie Ayam");
            System.out.println("2. Tampilkan Resep Mie Ayam");
            System.out.println("3. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.print("Masukkan nama resep: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan bahan: ");
                    String bahan = scanner.nextLine();
                    System.out.print("Masukkan langkah: ");
                    String langkah = scanner.nextLine();
                    app.tambahResep(nama, bahan, langkah);
                    break;
                case "2":
                    app.tampilkanResep();
                    break;
                case "3":
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (!pilihan.equals("3"));

        scanner.close();
    }
}
