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
public class Clase4 {
    public void letra(Modelo4 model){
        //variables
        String l="";
        
        //entrada
        Scanner teclado=new Scanner(System.in );
        System.out.println("ingrese un número  ");
       model.setN(teclado.nextInt());
        
        switch (model.getN()){
            case 0: 
                l="cero";
                break;
            case 1: 
                l="uno";
                break;
            case 2: 
                l="dos";
                break;
            case 3: 
                l="tres";
                break;
            case 4: 
                l="cuatro";
                break;
            case 5: 
                l="cinco";
                break;
            case 6: 
                l="seis";
                break;
            case 7: 
                l="siete";
                break;
            case 8: 
                l="ocho";
                break;
            case 9: 
                l="nueve";
                break;
            
        }
        System.out.println("letra: "+l);
    }
}
