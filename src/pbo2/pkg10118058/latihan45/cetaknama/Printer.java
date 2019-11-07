/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author user
 */
class Printer {
    
    private int jmlCetak;
    private String nama;
    
    Scanner input = new Scanner(System.in);

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void cetak(String nama) {
        this.nama = nama;
       
    }
    
    

    public void cetak(int jmlCetak, String nama) {
        
        this.jmlCetak = jmlCetak;
        this.nama = nama;
        System.out.print("Masukan Nama Anda : ");
        nama=input.next();
        System.out.println("Mau cetak berapa kali? : ");
        jmlCetak=input.nextInt();
        System.out.println(); 
        System.out.println("Nama Anda : " +nama);
        for (int i= 1 ; i<=jmlCetak; i++ ){
            System.out.println(+i+". "+nama);
            
        }
        
        
            
        
    }
    
}
