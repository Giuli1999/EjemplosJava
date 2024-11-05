/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejemplo2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo2 {

    public static void main(String[] args) {
        //variables
        int n;
        String r="";
        
        //entrada
        Scanner teclado= new Scanner(System.in );
        System.out.println("numero: ");
        n=teclado.nextInt();
        
        //proceso
        if (n>0) {
            r="positivo";
        }else if(n<0){
            r="negativo";
        }else if(n==0){
            r="neutro";
        }else {
            System.out.println("error ");
        }
        
        //salida
        System.out.println("resultado: "+r);
    }
}
