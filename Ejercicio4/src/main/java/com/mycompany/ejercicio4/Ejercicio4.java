package com.mycompany.ejercicio4;
import java.util.Scanner;
public class Ejercicio4 {
Scanner teclado = new Scanner (System.in);
int numero =0;

    public void leer(){
        System.out.println("Digite el numero");
        numero = teclado.nextInt();
        if (numero<0)System.out.println("El numero no es positivo!!!");
        else mostrar (numero);
    }

    
    public void mostrar (int x){
        for (int i =1; i<= x; i++){
             System.out.println(i);
        }
    }

    public static void main(String[] args) {
        
        Ejercicio4 llamar = new Ejercicio4();
        llamar.leer();
    }
}
