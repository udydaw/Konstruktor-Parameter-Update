/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class NonVoid {
    double r;
    double hasil;
    
    void NonVoid (double r){
        this.r = r;
    }
    double r(){
        return r;
    }
    void Hitung(){
        hasil = r*r*3.14;
        System.out.println("Luas Lingkaran: "+hasil);
    }
    
}


