/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pbo.kelasdanobjek;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class KelasdanObjek {

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang();
        System.out.println("Persegi Panjang 1");
        System.out.println("Luas = " + persegiPanjang1.Luas());
        System.out.println("Keliling = " + persegiPanjang1.Kelilng());
        System.out.println("");
        
        PersegiPanjang persegiPanjang2 = new PersegiPanjang();
        persegiPanjang2.panjang = 30;
        persegiPanjang2.lebar = 40;
        System.out.println("Persegi Panjang 2");
        System.out.println("Luas = " + persegiPanjang2.Luas());
        System.out.println("Keliling = " + persegiPanjang2.Kelilng());
        System.out.println("");
        
        PersegiPanjang persegiPanjang3 = new PersegiPanjang();
        persegiPanjang3.setPanjangLebar(25, 35);
        System.out.println("Persegi Panjang 3");
        System.out.println("Luas = " + persegiPanjang3.Luas());
        System.out.println("Luas = " + persegiPanjang3.Kelilng());
    }
}



















