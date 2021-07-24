/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tarea2;

/**
 *
 * @author HP-PC
 */
public class tarea2 {
  
    public static String InversaAscii(String palabra){
        String resultado = "";
        double codificar;
         codificar = Double.parseDouble(palabra);
         
            char caracter = (char)codificar;
            resultado = resultado + caracter;
            
            System.out.println("Codigo recibido = " + palabra);    
            System.out.println("Resultado en letras: "+ resultado);
            
        return resultado;
    }
    
    public static void main(String[] args){    
      String resultado  = InversaAscii("66"); 
      String resultado1 = InversaAscii("85"); 
      String resultado2 = InversaAscii("69"); 
      String resultado3 = InversaAscii("78"); 
      String resultado4 = InversaAscii("68"); 
      String resultado5 = InversaAscii("73");
      String resultado6 = InversaAscii("33");
      
      System.out.println("EL codigo descartado es: " + resultado + resultado1 + resultado2 + resultado3 + resultado4 + resultado5  + resultado6 );
    }    
}
    


