/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan25_ejaannama;
import java.util.Scanner;

/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO25
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Ejaan Nama
 */
public class SI_RegPagi_22166010_Latihan25_EjaanNama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama depan untuk dieja : ");
        String name = input.nextLine();

        // Memecah nama menjadi huruf-huruf
         System.out.println("Ejaan untuk \"" + name + "\" adalah :");
         
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Huruf ke-" + (i+1) + ": " + name.charAt(i));
        
        }
    }
    
}
