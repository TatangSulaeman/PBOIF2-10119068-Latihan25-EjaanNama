/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan Ejaan nama
 */

public class PBOIF210119068Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    
    public static void ejaanNama(String nama, int jumlahHuruf){
        for (int i = 0;i < jumlahHuruf; i++){
            char eja = nama.charAt(i);
            int no = i+1;
            System.out.println("Huruf ke-" + no + " : " + eja);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        
        String nama ;
        int jumlahHuruf = 0;
        
        System.out.print("Masukkan nama depan untuk di eja : ");
        nama = keyboard.nextLine();
        
        jumlahHuruf = nama.length();
        
        System.out.println("");
        System.out.println("Ejaan untuk " + "''" + nama + "''" + " adalah : ");
        ejaanNama(nama,jumlahHuruf);
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
