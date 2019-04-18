package belajarjavaoop;

//KELAS
public class Mobil {
    //ATRIBUT
    String merk = "Toyota";
    String warna;
    int harga;
    int tahun;
    
    int jarak;
    int kecepatan = 10;
    int waktu = 10;
    
    //PROSEDUR
    void jalan(){
        System.out.println("Laju mobil dengan kecepatan 100 km/jam");
    }
    
    //FUNGSI
    int hitungJarak(){
        return kecepatan * waktu;
    }
    
}
