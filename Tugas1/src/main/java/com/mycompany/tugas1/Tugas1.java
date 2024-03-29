/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas1;
import java.util.Scanner;

/**
 *
 * @author KENT
 */
public class Tugas1 {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        
        double nilaiC = 18;
        double nilaiD = 11;
        
        boolean isPlus = true;
        
        System.out.println("Nilai A : " + nilaiA);
        System.out.println("Nilai B : " + nilaiB);
        System.out.println("Nilai C : " + nilaiC);
        System.out.println("Nilai D : " + nilaiD);
        
        Scanner input = new Scanner(System.in);
        System.out.println("Input Nilai A : ");
        nilaiA = input.nextInt();
        
        System.out.println("Input Nilai B : ");
        nilaiB = input.nextInt();
        
        System.out.println("Input Nilai C : ");
        nilaiC = input.nextDouble();
        
        System.out.println("Input Nilai D : ");
        nilaiD = input.nextDouble();
        
        System.out.println("Input Nilai Boolean : ");
        isPlus = input.nextBoolean();
        
        System.out.println("Nilai A: " + nilaiA);
        System.out.println("Nilai B: " + nilaiB);
        System.out.println("Nilai C: " + nilaiC);
        System.out.println("Nilai D: " + nilaiD);
        System.out.println("is Plus: " + isPlus);
        
        String nama = "";
        System.out.println("Masukkan input nama lengkap : ");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("Nama Lengkap : " + nama);
        
        
        
        
    }
}
