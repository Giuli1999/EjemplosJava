/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo6;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo2 {
    public static void main(String[] args) {
        //variables 
        int s=0, i, j;
        
        //arreglos
        int n[][]= new int[3][2];
        
        //entrada 
        Scanner teclado= new Scanner(System.in );
        System.out.println("numero (0,0): ");
        n[0][0]= teclado.nextInt();
        System.out.println("numero (0,1): ");
        n[0][1]= teclado.nextInt();
        System.out.println("numero (1,0): ");
        n[1][0]= teclado.nextInt();
        System.out.println("numero (1,1): ");
        n[1][1]= teclado.nextInt();
        System.out.println("numero (2,0): ");
        n[2][0]= teclado.nextInt();
        System.out.println("numero (2,1): ");
        n[2][1]= teclado.nextInt();
        
        //proceso
        for ( i = 0; i <= 2; i++) {
            for ( j = 0; j <= 1; j++) {
                s+=n[i][j];
            }
            
        }
        //salida
        System.out.println("suma: "+s);
    }
}
