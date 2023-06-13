
package penilaian;

public class Main {

    
    public static void main(String[] args) {
        NilaiAkhir agil = new NilaiAkhir("Sopyan Agil","2110010152",80,80,80);
        
        System.out.println("Nama : " + agil.getNama());
        System.out.println("NPM : " + agil.getNpm());
        System.out.println("Nilai Akhir : " + agil.hitungNilaiAkhir());
    }
    
}
