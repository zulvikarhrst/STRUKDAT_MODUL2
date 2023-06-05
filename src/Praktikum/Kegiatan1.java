package Praktikum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kegiatan1 {
    public static void main(String[] args){
        ArrayList<String> Hewan = new ArrayList<>(Arrays.asList("Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"));
        
        System.out.println("Nomor 2");
        Collections.addAll(Hewan, "Badak", "Bebek");
        System.out.println(Hewan);
        System.out.println("Jumlah Bebek = " + Collections.frequency(Hewan, "Bebek"));
        System.out.print("Index Bebek = " + Hewan.indexOf("Bebek") + ", ");
        System.out.println(Hewan.lastIndexOf("Bebek"));

        System.out.println("\nNomor 3");
        Hewan.remove(1);
        System.out.println(Hewan);

        System.out.println("\nNomor 4");
        System.out.println("Index ke-0 : " + Hewan.get(0));
        System.out.println("Index ke-2 : " + Hewan.get(2));
        Hewan.remove(0);
        System.out.println(Hewan);

        System.out.println("\nNomor 5");
        Hewan.set(0, "Ular");
        System.out.println(Hewan);
        Hewan.add(2, "Itik");
        System.out.println(Hewan);

        System.out.println("\nNomor 6");
        Hewan.subList(2, 5).clear();
        System.out.println(Hewan);
        
        System.out.println("\nNomor 7");
        System.out.println("Elemen Pertama : " + Hewan.get(0));
        System.out.println("Elemen Terakhir : " + Hewan.get(Hewan.size() - 1));

        System.out.println("\nNomor 8");
        System.out.println("Jumlah Elemen : " + Hewan.size());
        
        System.out.println("\nNomor 9");
        System.out.println("Posisi Index dari Badak : " + Hewan.indexOf("Badak"));
    }
}