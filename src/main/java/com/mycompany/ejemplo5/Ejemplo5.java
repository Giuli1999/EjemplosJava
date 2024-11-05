/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo5 {

    public static void main(String[] args) {
        //variables
        int i, n,s=0;
        
        //entrada
        Scanner teclado = new Scanner(System.in );
        System.out.println("el número: ");
        n=teclado.nextInt();
        
        //proceso
        for (i = 1;  i <= n; i++) {
            s=s+i;
        }
        //salida 
        System.out.println("suma: "+s);
    }
}
