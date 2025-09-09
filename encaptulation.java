class mahasiswa {
    private String nama;
    private int umur;

    public void setDataMahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    private String getDataMahasiswa() {
        return "Nama Saya " + nama + " Umur Saya " + umur;
    }

    public String getHidedDataMahasiswa() {
        return "Hai, " + getDataMahasiswa();
    }
}

public class encaptulation {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setDataMahasiswa("Muhammad Rifky Ramadani", 10);
        System.out.println(mhs1.getHidedDataMahasiswa());
    }
}
