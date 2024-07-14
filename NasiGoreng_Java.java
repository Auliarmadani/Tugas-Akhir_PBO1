public class NasiGoreng {
    public static void main(String[] args) {
        System.out.println("Resep Nasi Goreng:");
        
        // Bahan-bahan
        String[] bahan = {
            "2 piring nasi putih",
            "2 siung bawang putih, cincang halus",
            "1 siung bawang merah, cincang halus",
            "1 butir telur",
            "100 gram ayam, potong dadu",
            "2 sdm kecap manis",
            "1 sdm saus sambal",
            "Garam secukupnya",
            "Minyak untuk menumis",
            "Daun bawang, untuk taburan"
        };
        
        // Langkah-langkah
        String[] langkah = {
            "1. Panaskan minyak di wajan.",
            "2. Tumis bawang putih dan bawang merah hingga harum.",
            "3. Masukkan potongan ayam, masak hingga ayam matang.",
            "4. Dorong bahan ke sisi wajan, lalu pecahkan telur dan orak-arik.",
            "5. Tambahkan nasi putih, aduk rata.",
            "6. Tambahkan kecap manis dan saus sambal, aduk hingga semua bahan tercampur.",
            "7. Bumbui dengan garam secukupnya.",
            "8. Angkat dan sajikan, taburi dengan daun bawang."
        };

        System.out.println("\nBahan-bahan:");
        for (String b : bahan) {
            System.out.println("- " + b);
        }

        System.out.println("\nLangkah-langkah:");
        for (String l : langkah) {
            System.out.println(l);
        }
    }
}
