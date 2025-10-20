package merek_mobil_kw;

class Mobil {
 
    private String merk;
    private String model;
    private int tahunPembuatan;


    public Mobil(String merk, String model, int tahunPembuatan) {
        this.merk = merk;
        this.model = model;
        this.tahunPembuatan = tahunPembuatan;
    }
    
    // Method untuk menampilkan informasi mobil
    public void infoMobil() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Pembuatan: " + tahunPembuatan);
        System.out.println(); // Baris kosong agar output rapi
    }
    
  
}

public class Merek_mobil_kw {
    
    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil("Hotwheels", "Supra Mazda R", 2020);
        
        Mobil mobil2 = new Mobil("Honda", "Brio", 2013);

        System.out.println("=== Informasi Mobil ===");
        
        mobil1.infoMobil();
        
        mobil2.infoMobil();
    }
}