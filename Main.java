import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void tampilkanData(ArrayList<Buku> daftarBuku, String judul) {
        System.out.println("\n" + judul);
        System.out.println("=".repeat(judul.length()));
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i+1)+". " + daftarBuku.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Buku> daftarBuku = new ArrayList<>();

        daftarBuku.add(new Buku("1234-5678", "John Doe", "Pemrograman Python", "2021-01-15", "Tech Press", 150000));
        daftarBuku.add(new Buku("2345-6789", "Jane Smith", "Data Science untuk Pemula", "2022-03-10", "Data Insights", 200000));
        daftarBuku.add(new Buku("3456-7890", "Alex Johnson", "Dasar-Dasar Machine Learning", "2020-05-20", "AI Books", 250000));
        daftarBuku.add(new Buku("4567-8901", "Maria Garcia", "Statistik Terapan", "2019-07-30", "Stat Press", 180000));
        daftarBuku.add(new Buku("5678-9012", "Michael Brown", "Keamanan Siber", "2023-02-25", "Cyber Security Press", 220000));
        daftarBuku.add(new Buku("6789-0123", "Emily Davis", "Blockchain untuk Bisnis", "2022-11-15", "Blockchain Publishing", 275000));
        daftarBuku.add(new Buku("7890-1234", "David Wilson", "Pengantar Cloud Computing", "2021-08-05", "Cloud Books", 230000));
        daftarBuku.add(new Buku("8901-2345", "Sarah Miller", "Internet of Things", "2023-04-18", "IoT Press", 240000));
        daftarBuku.add(new Buku("9012-3456", "Christopher Martinez", "Desain Antarmuka Pengguna", "2020-09-12", "UX Books", 190000));
        daftarBuku.add(new Buku("0123-4567", "Linda Taylor", "Teknologi 5G", "2023-06-30", "Future Tech Press", 300000));

        // 1. Menampilkan data sebelum diurutkan
        tampilkanData(daftarBuku, "Data Buku Sebelum Diurutkan");

        // 2. Mengurutkan dan menampilkan data berdasarkan nama pengarang
        Collections.sort(daftarBuku, new Comparator<Buku>() {
            @Override
            public int compare(Buku b1, Buku b2) {
                return b1.getPengarang().compareTo(b2.getPengarang());
            }
        });
        tampilkanData(daftarBuku, "Data Buku Setelah Diurutkan Berdasarkan Nama Pengarang");

        // 3. Mengubah data dan menampilkan
        daftarBuku.get(4).setHarga(180000);
        daftarBuku.get(4).setPenerbit("Data Science Press");
        tampilkanData(daftarBuku, "Data Setelah Mengubah Harga dan Penerbit Buku Kelima");

        // 4. Menghapus data dan menampilkan
        daftarBuku.remove(7);
        tampilkanData(daftarBuku, "Data Setelah Menghapus Buku Index ke-7");

        // 5. Menambah data di awal (index 0)
        daftarBuku.add(0, new Buku("2004-1304", "Cinta Aprilianti", "Desain UI/UX", "2023-04-13", "Gramedia", 280000));
        tampilkanData(daftarBuku, "Data Setelah Menambah Buku di Index 0");

        // 6. Menambah data di tengah (index 5)
        daftarBuku.add(5, new Buku("1632-3119", "Rinaldi Munir", "Matematika Diskrit", "2023-09-26", "Ganesha", 185000));
        tampilkanData(daftarBuku, "Data Setelah Menambah Buku di Index 5");

        // 7. Menambah data di akhir
        daftarBuku.add(new Buku("3110-2004", "Reinhart Panjaitan", "Mobile App Development", "2023-10-31", "Graha Ilmu", 260000));
        tampilkanData(daftarBuku, "Data Setelah Menambah Buku di Akhir");
    }
}