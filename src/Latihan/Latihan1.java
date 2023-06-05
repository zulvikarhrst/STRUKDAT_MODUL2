package Latihan;

import java.util.ArrayList;
/**
 *
 * @author Zulvikar Harist
 */
public class Latihan1 {
    public static void main(String[] args) {
        // Buat objek Hewan
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Hewan : ");
        System.out.println(hewan);
        
        // Buat objek DeleteHewan
        ArrayList<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        // Buat objek untuk menampung data yang dihapus
        ArrayList<String> deletedData = new ArrayList<>();
        
        // Hapus data yang sama dengan data warna pada DeleteHewan
        for (String warna : deleteHewan) {
            hewan.removeIf(h -> h.equals(warna));
            deletedData.add(warna); // Tambahkan data yang dihapus ke dalam deletedData
        }
        
        // Tampilkan hasil penghapusan
        System.out.println("Hewan yang dihapus:");
        System.out.println(deletedData);
        
        // Tampilkan hasil setelah menghapus data
        System.out.println("Output Hewan:");
        System.out.println(hewan);
    }
}

