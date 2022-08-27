package com.mycompany.ejercicio1;
import java.util.Scanner;

public class Ejercicio1 {

   public static void main(String[] args) {
        
       
        Scanner teclado = new Scanner (System.in);
        int n1,n2;
        
        System.out.println("Ingrese primer valor: ");
        n1 = teclado.nextInt();
        System.out.println("Ingrese segundo valor: ");
        n2 = teclado.nextInt();
        
        if (n1>n2){
            System.out.println("El mayor es: "+n1);
        } else {
                    System.out.println("El mayor es: "+n2);
                    }
            
        
        
        
        
    }
}
