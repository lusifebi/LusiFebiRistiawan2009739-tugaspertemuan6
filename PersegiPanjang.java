/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.kelasdanobjek;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class PersegiPanjang {
    int panjang = 1;
    int lebar = 1;
     
    int Luas (){
        return panjang * lebar;
    }
    
    int Kelilng (){
        return (2 * panjang) + (2 * lebar);
    }
    
    void setPanjangLebar (int newPanjang, int newLebar){
        panjang = newPanjang;
        lebar = newLebar;
    }
}
