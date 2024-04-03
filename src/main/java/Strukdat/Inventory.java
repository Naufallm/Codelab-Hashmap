package Strukdat;

import java.util.HashMap;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Inventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventori = new HashMap<>();

        inventori.put("Pensil", 50);
        inventori.put("Buku", 35);
        inventori.put("Penghapus", 25);

        System.out.println("Inventori1 awal : " + inventori);

        inventori.put("Pensil", inventori.get("Pensil") + 20);

        inventori.remove("Penghapus");

        System.out.println("Inventori1 setelah update: " + inventori);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama barang yang ingin dicari :");
        String barang = scanner.nextLine();

        cariBarang(inventori, barang);
    }
    public static void cariBarang(HashMap<String, Integer> inventori, String barang){
        if (inventori.containsKey(barang)){
            System.out.println("Stok"+barang+":"+inventori.get(barang)+"unit.");
        } else {
            System.out.println("Barang" +barang+ "Tidak tersedia di inventori");
        }
    }
}