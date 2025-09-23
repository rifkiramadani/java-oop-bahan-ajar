package praktikum5;

class Kendaraan {
    String nama;

    public Kendaraan(String nama) {
        this.nama = nama;
    }

    public void bergerak() {
        System.out.println("Kendaraan " + nama + " Sedang Bergerak");
    }
}

class Mobil extends Kendaraan{
    public Mobil(String nama) {
        super(nama);
    }
}

class Pengemudi {
    String nama;

    public Pengemudi(String nama) {
        this.nama = nama;
    }

    public void mengemudi(Mobil mobil) {
        System.out.println(nama + " Sedang Mengemudi " + mobil.nama);
    }
}

public class classRelation {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Fortuner");
        Pengemudi pengemudi1 = new Pengemudi("Muhammad Rifky Ramadani");

        mobil1.bergerak();
        pengemudi1.mengemudi(mobil1);
    }
}