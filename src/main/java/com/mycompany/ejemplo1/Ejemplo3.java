/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplo1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejemplo3 {

    public static void main(String[] args) {
        //variables
        float vv,igv,pv;
        String textoIgv,textoVenta;
        textoIgv="igv: ";
        textoVenta="pv: ";
                
        //entrada
        Scanner teclado=new Scanner (System.in );
        System.out.println("valor de la venta: ");
       vv=teclado.nextFloat();
       
       //proceso
       igv=(float) (vv*0.19);
       pv=vv+igv;
       
       //salida
       
        System.out.println(textoIgv+igv);
        System.out.println(textoVenta+pv);
       
       
    }
}
