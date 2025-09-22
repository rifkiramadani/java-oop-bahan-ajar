package praktikum4;

class Dosen {
    String nama;
    int umur;

    public Dosen(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void mengajar() {
        System.out.println("Dosen " + nama + " Sedang Mengajar " + "umurnya " + umur);
    }

    // Static
    public void mengajar(String mataKuliah) {
        System.out.println("Dosen dengan nama " + nama + " umurnya " + umur + " sedang mengajar " + mataKuliah);
    }
}

class DosenTetap extends Dosen {
    int gajiPokok;

    public DosenTetap(String nama, int gajiPokok, int umur) {
        super(nama,umur);
        this.gajiPokok = gajiPokok;
    }

    @Override
    public void mengajar() {
        System.out.println("Dosen " + nama + " sedang mengajar " + "umurnya " + umur + " gajinya " + gajiPokok);
    }
}

public class inheritancePolymorphism {
    public static void main(String[] args) {
        // Dynamic
        Dosen dsn1 = new Dosen("Keisha", 30);
        dsn1.mengajar();

        // Static
        dsn1.mengajar("Kompro");
    }
}