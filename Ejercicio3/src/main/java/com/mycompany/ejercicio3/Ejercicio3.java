
package com.mycompany.ejercicio3;
import java.util.Scanner;
public class Ejercicio3 {
Scanner teclado = new Scanner (System.in);
int numero =0;

public void mostrarcuadrado(){
    
    while(numero>=0){
        System.out.println("Digite el numero (-l para salir): ");
        numero = teclado.nextInt();
        
        if (numero>=0)System.out.println("El cuadro es: "+ numero*numero);
        
    }
    
}


    public static void main(String[] args) {
        Ejercicio3 llamar = new Ejercicio3();
        llamar.mostrarcuadrado();
    }
}
