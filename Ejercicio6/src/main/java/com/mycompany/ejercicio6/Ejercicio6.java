package com.mycompany.ejercicio6;
import java.util.Scanner;

public class Ejercicio6 {
Scanner teclado = new Scanner (System.in);
int numero =0;


public void leer(){
        System.out.println("Digite el numero");
        numero = teclado.nextInt();
        if (numero<0 || numero>10)System.out.println("El numero no esta entre 0 y 10!");
        else mostrartabla (numero);
    }

public void mostrartabla (int x){
    System.out.println("Latabla de multiplicar del"+x+"es: ");
        for (int i =1; i<= 10; i++){
             System.out.println(x+" * "+i+ " = " +x*1);
        }
    }


    public static void main(String[] args) {
        Ejercicio6 llamar=new Ejercicio6();
        llamar.leer();
    }
}
