
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class Void {
       double panjang,lebar, hasil;
    
    void Void(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void hitung(){
        hasil = panjang*lebar;
        System.out.println("Luas Persegi Panjang : "+hasil);
    }
}