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
public class Clase3 {
   public void consumir(){
       metodo();
   }
    public void metodo() {
                  //variables
       int n;
       String e="";
       
       //entrada
       Scanner teclado=new Scanner(System.in );
        System.out.println("ingrese el número: ");
        n= teclado.nextInt();
        
        //proceso
        switch (n){
            case 1:
                e="verano";
                break;
            case 2:
                e="otoño";
                break;  
            case 3:
                e="invierno";
                break;
            case 4:
                e="primavera";
                break;
        }
        
        //salida
        System.out.println("la estación es: "+e);
    }

}
