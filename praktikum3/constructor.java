package praktikum3;
class mahasiswa {
    String nama;
    String hobi;
    int umur;

    mahasiswa(String nama, String hobi, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }
}

public class constructor {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Muhammad Rifky Ramadani", "Mancing", 10);
        System.out.println("Halo, nama saya " + mhs1.nama);
        System.out.println("Hobi Saya " + mhs1.hobi);
        System.out.println("Umur Saya " + mhs1.umur + " Tahun");
    }
}
