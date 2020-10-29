/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : SaldoTabungan
 */
public class IF110119005Latihan19SaldoTabungan {
    static Scanner scan = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Saldo Awal\t: ");
        String saldoPertama = scan.next ();
        System.out.print("Bunga (%)\t: ");
        String p_bunga = scan.next();
        System.out.print("Lama (bulan)\t: ");
        String p_lama = scan.next();
        
        double bunga = Integer.parseInt(p_bunga);
        int saldo = Integer.parseInt(saldoPertama);
        
        for (int i=0; i<Integer.parseInt(p_lama);i++) {
            saldo += (saldo*bunga/100);
            System.out.println("Saldo di bulan ke-"+ (i+1)+" Rp."+saldo);
        
    }
    
}
}
