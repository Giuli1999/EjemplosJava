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
public class Clase6 implements Interface6 {

    @Override
    public void metodo() {
        //variables
        char l = 0;
        String v = "";

        //entrada 
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el dato: ");
        l = teclado.next().charAt(l);

        //proceso
        if (l == 'a' || l == 'A') {
            v = "ES VOCAL";
        } else if (l == 'e' || l == 'E') {
            v = "ES VOCAL";
        } else if (l == 'i' || l == 'I') {
            v = "ES VOCAL";
        } else if (l == 'o' || l == 'O') {
            v = "ES VOCAL";
        } else if (l == 'u' || l == 'U') {
            v = "ES VOCAL";
        } else {
            v = "NO ES VOCAL";
        }
        //SALIDA
        System.out.println("");
        System.out.println("el dato es: "+v);
    }

}
