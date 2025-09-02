class Mobil {
    String nama;
    int jumlahRoda;
    boolean diJual;

    void infoMobil() {
        System.out.println("Nama Mobil : " + this.nama);
        System.out.println("Jumlah Roda : " + this.jumlahRoda);
        System.out.println("Apakah Di Jual ? " + this.diJual);
    }
}

class classObject {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.nama = "Avanza";
        mobil1.jumlahRoda = 4;
        mobil1.diJual = false;
        mobil1.infoMobil();
    }
}