import java.util.Scanner;

public class pustaka {

    public static void main(String[] args) {

        String nama;
        int aksi, lamaPinjam, pinjam = 1, kembali;

        Scanner input = new Scanner(System.in);

        novel n1 = new novel("Laskar Pelangi", 1, "Andrea Hinata", "Slice of Life");
        novel n2 = new novel("Pulang-Pergi", 2, "Tere Liye", "Aksi");
        novel n3 = new novel("Surat dari Kematian", 3, "Adham T Fusama", "Horror");

        sains inf1 = new sains("Pemograman Java Dasar", 5, "Muhammad Boediono", "PBO");
        sains inf2 = new sains("Basis Data Lanjutan 2021", 7, "Steven Surya", "BDL");
        sains umum1 = new sains("Bahasa Inggris Kuliah Umum", 4, "Heri Rosiadi", "B.Inggris");
        sains umum2 = new sains("Gerbang Logika ", 6, "Zahnur", "Logika");

        sejarah sj1 = new sejarah("Sejarah Benua Eropa", 8, "Wahjudi Djaja", "Europe");
        sejarah sj2 = new sejarah(nama, kembali, nama, nama);

        System.out.println("        SELAMAT DATANG DI PUSTAKA BERKAH BELAJAR BERSAMA        ");

        System.out.println("\nMasukkan Nama Anda :");
        nama = input.nextLine();

        System.out.println(" Apakah Anda ingin meminjam / mengembalikan Buku?");
        System.out.println(" 1. Pinjam");
        System.out.println(" 2. Kembalikan");
        System.out.println(" Masukkan Pilihan Anda :");
        aksi = input.nextInt();

        if (aksi == 1) {

            System.out.println(" Daftar Buku :");

            System.out.println(" 1. " + n1.getjudul());
            System.out.println(" 2. " + n2.getjudul());
            System.out.println(" 3. " + n3.getjudul());

            System.out.println(" 4. " + inf1.getjudul());
            System.out.println(" 5. " + inf2.getjudul());
            System.out.println(" 6. " + umum1.getjudul());
            System.out.println(" 7. " + umum2.getjudul());

            do {
                System.out.println(" Buku mana yg ingin Anda pinjam?");
                System.out.println(" Masukkan Pilihan Anda :");
                pinjam = input.nextInt();

                if (pinjam > 7 && pinjam < 1) {
                    System.out.println("MAAF BUKU TIDAK TERSEDIA");
                }

            } while (pinjam > 7 && pinjam < 1);

            System.out.println(" Berapa lama Anda ingin meminjam buku tersebut?");
            System.out.println(" 1. Tiga Hari");
            System.out.println(" 2. Lima Hari");
            System.out.println(" 3. Tujuh Hari");
            System.out.println(" Masukkan Pilihan Anda :");
            lamaPinjam = input.nextInt();

            System.out.println(" Nama            : " + nama);
            System.out.println(" Kegiatan        : Meminjam buku");
            switch (pinjam) {
                case 1:
                    System.out.println(" Judul buku      : " + n1.getjudul());
                    break;
                case 2:
                    System.out.println(" Judul buku      : " + n2.getjudul());
                    break;
                case 3:
                    System.out.println(" Judul buku      : " + n3.getjudul());
                    break;
                case 4:
                    System.out.println(" Judul buku      : " + inf1.getjudul());
                    break;
                case 5:
                    System.out.println(" Judul buku      : " + inf2.getjudul());
                    break;
                case 6:
                    System.out.println(" Judul buku      : " + umum1.getjudul());
                    break;
                case 7:
                    System.out.println(" Judul buku      : " + umum2.getjudul());
                    break;
                default:
                    System.out.println("MAAF TIDAK ADA BUKU");
            }
            switch (lamaPinjam) {
                case 1:
                    System.out.println(" Lama Peminjaman : Tiga Hari");
                    break;
                case 2:
                    System.out.println(" Lama Peminjaman : Lima Hari");
                    break;
                case 3:
                    System.out.println(" Lama Peminjaman : Tujuh Hari");
                    break;
            }
        }

        else if (aksi == 2) {

            System.out.println("Daftar Buku :");

            System.out.println(" 1. " + n1.getjudul());
            System.out.println(" 2. " + n2.getjudul());
            System.out.println(" 3. " + n3.getjudul());

            System.out.println(" 4. " + inf1.getjudul());
            System.out.println(" 5. " + inf2.getjudul());
            System.out.println(" 6. " + umum1.getjudul());
            System.out.println(" 7. " + umum2.getjudul());

            System.out.println("Buku mana yg ingin Anda kembalikan?");
            System.out.println("Masukkan Pilihan Anda :");
            kembali = input.nextInt();

            System.out.println(" Nama       : " + nama);
            System.out.println(" Kegiatan   : Mengembalikan buku");
            switch (kembali) {
                case 1:
                    System.out.println(" Judul buku : " + n1.getjudul());
                    break;
                case 2:
                    System.out.println(" Judul buku : " + n2.getjudul());
                    break;
                case 3:
                    System.out.println(" Judul buku : " + n3.getjudul());
                    break;
                case 4:
                    System.out.println(" Judul buku : " + inf1.getjudul());
                    break;
                case 5:
                    System.out.println(" Judul buku : " + inf2.getjudul());
                    break;
                case 6:
                    System.out.println(" Judul buku : " + umum1.getjudul());
                    break;
                case 7:
                    System.out.println(" Judul buku : " + umum2.getjudul());
                    break;

            }
        }
        System.out.println(" \nTerima Kasih telah berkunjung\n ");
        input.close();
    }

}