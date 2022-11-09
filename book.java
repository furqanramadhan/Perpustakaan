public abstract class book {

    private String judul;
    private int kodeBuku;
    private String pengarang;

    public book(String judul, int kodeBuku, String pengarang) {
        this.judul = judul;
        this.kodeBuku = kodeBuku;
        this.pengarang = pengarang;
    }

    /**
     * @return method accessor untuk mengembalikan judul kedalam buku.
     */
    public String getJudul() {
        return this.judul;
    }

    /**
     * @return method accessor untuk mengembalikan kode buku kedalam buku.
     */
    public int getKodeBuku() {
        return this.kodeBuku;
    }

    /**
     * @return method accessor untuk mengembalikan pengarang kedalam buku.
     */
    public String getPengarang() {
        return this.pengarang;
    }

    abstract void available();
}