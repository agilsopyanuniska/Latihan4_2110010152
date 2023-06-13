
package penilaian;


public class Mahasiswa {
    String nama,npm;

    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }
    
    
}
