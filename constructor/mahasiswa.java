package constructor;
class constructor {
    String nama;
    String hobi;
    int umur;

    constructor(String nama, String hobi, int umur) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }
}

public class mahasiswa {
    public static void main(String[] args) {
        constructor mhs1 = new constructor("Muhammad Rifky Ramadani", "Mancing", 10);
        System.out.println("Halo, nama saya " + mhs1.nama);
        System.out.println("Hobi Saya " + mhs1.hobi);
        System.out.println("Umur Saya " + mhs1.umur + " Tahun");
    }
}
