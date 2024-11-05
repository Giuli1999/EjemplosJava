/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {
    public static void main(String[] args) {
        //variables
        char c;
        String r;
        
        //entrada
        Scanner teclado=new Scanner(System.in );
        System.out.println("caracter: ");
        c=teclado.next().charAt(0);
        
        //proceso
        r="NO ES VOCAL";
        if (c== 'a' || c=='A' ) {
            r="ES VOCAL";
        }if(c== 'e' || c=='E'){
            r="ES VOCAL";
        }if(c== 'i' || c=='I'){
            r="ES VOCAL";
        }if(c== 'o' || c=='O'){
            r="ES VOCAL";
        }if(c== 'u' || c=='U'){
            r="ES VOCAL";
        }
        
        //salida
        System.out.println("");
        System.out.println("Resultado: "+r);
        
    }
}
