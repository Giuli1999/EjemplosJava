/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Clase5 implements Interface5 { 

    @Override //es una notación
    public void metodo() {
     //variables
        int n1, n2, r=0;
        char op;
        
        //entrada 
        Scanner teclado= new Scanner(System.in );
        System.out.println("operacion: ");
        op= teclado.next().charAt(0);
        System.out.println("numero 1: ");
        n1=teclado.nextInt();
        System.out.println("numero 2: ");
        n2=teclado.nextInt();
        
        //proceso
        if (op=='+') {
            r=n1+n2;
        }else if (op == '-') {
            r=n1 - n2;
        }else if (op == '*') {
            r = n1 * n2;
        }else if (op == '/') {
            if (n2 !=0) {
                r= n1 / n2;
            }else   {
                r=0;
            }
        }
        //salida
        System.out.println("el resultado es: "+r);
    }
    
}
