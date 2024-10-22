public class Buku {
    private String issn;
    private String pengarang;
    private String judul;
    private String tanggalTerbit;
    private String penerbit;
    private double harga;

    public Buku(String issn, String pengarang, String judul, String tanggalTerbit, String penerbit, double harga) {
        this.issn = issn;
        this.pengarang = pengarang;
        this.judul = judul;
        this.tanggalTerbit = tanggalTerbit;
        this.penerbit = penerbit;
        this.harga = harga;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return String.format("ISSN: %s, Pengarang: %s, Judul: %s, Tanggal Terbit: %s, Penerbit: %s, Harga: Rp %.0f",
                issn, pengarang, judul, tanggalTerbit, penerbit, harga);
    }
}