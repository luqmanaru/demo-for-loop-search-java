package com.mycompany.strukturkontrolpemilihan;

/**
 * Demonstrasi For Loop untuk Pencarian Array
 * @author luqmanaru
 */
public class PencarianArray {
    public static void main(String[] args) {
        String[] names = {"Beah", "Blanca", "Lance", "Belle",
                         "Nice", "Yza", "Goen", "Ethan"};
        String searchName = "Yza";
        boolean foundName = false;
        
        // For loop untuk pencarian
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                foundName = true;
                break;
            }
        }
        
        // Output hasil pencarian
        if (foundName) {
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found.");
        }
    }
}
