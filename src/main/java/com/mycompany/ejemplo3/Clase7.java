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
public class Clase7 {
     public void letra(Modelo7 model){
        //variables
        String e="";
        
        //entrada
        Scanner teclado=new Scanner(System.in );
        System.out.println("ingrese un número  ");
       model.setN(teclado.nextInt());
        
        switch (model.getN()){
            case 1: 
            case 2:
            case 3: 
                e="VERANO";
                break;
            case 4: 
            case 5:
            case 6: 
                e="OTOÑO";
                break;
            case 7: 
            case 8:
            case 9: 
                e="INVIERNO";
                break;
            case 10: 
            case 11:
            case 12: 
                e="PRIMAVERA";
                break;
        }
        //SALIDA
         System.out.println("");
         System.out.println("La estación es: "+e);
     }
}
