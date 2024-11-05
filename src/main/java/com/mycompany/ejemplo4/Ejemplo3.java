/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo4;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        //variables
        int i, c=0, n;
        
        try{
        //entrada
        Scanner teclado= new Scanner(System.in );
        System.out.println("ingrese un número: ");
        n= teclado.nextInt();
        
        //proceso
        i=1;
        while (i<=n){
            if (i%5==0) {
                c=c+1;
            }
         i++;
        }   
        //salida
        System.out.println("la cantidad de número: "+c);
        }catch (Exception e) {
            System.out.println("error es:  " + e);
        }
    }
}
