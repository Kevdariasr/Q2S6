package com.mycompany.ejercicio2;
import java.util.Scanner;

public class Ejercicio2 {
Scanner teclado = new Scanner (System.in);
int n1,n2,n3;

    public void leer(){
        System.out.println("ingrese la primer nota: ");
        n1 = teclado.nextInt();
        System.out.println("ingrese la primer nota: ");
        n2 = teclado.nextInt();
        System.out.println("ingrese la primer nota: ");
        n3 = teclado.nextInt();
    }

    private static int promedio(int var1,int var2,int var3){
        return ((var1 + var2 + var3)/3);
     }

    public void mensaje(){
        
        System.out.println("El promedio es: " + promedio(n1,n2,n3));
        if (promedio(n1,n2,n3)>7) System.out.println("Gano el curso");
        else System.out.println("Perdio el curso");
        
    }



    public static void main(String[] args) {
        Ejercicio2 llamar = new Ejercicio2 ();
        llamar.leer();
        llamar.mensaje();
        
        
        
    }
    
}
