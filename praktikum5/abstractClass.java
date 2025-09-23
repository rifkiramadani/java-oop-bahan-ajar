package praktikum5;

 abstract class Hewan {
    String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public abstract void bersuara();

    public void info() {
        System.out.println("Nama Hewan : " + nama);
    }
}

class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void bersuara() {
        System.out.println("Meongg!!!");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Kitty");

        kucing1.info();
        kucing1.bersuara();
    }
}
