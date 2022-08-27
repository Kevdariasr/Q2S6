package com.mycompany.ejercicio7;
import java.util.Scanner;
public class Ejercicio7 {
Scanner leer = new Scanner (System.in);
double n1,n2 =0;
int opcion=0;

public void leer(){
    System.out.println("Digite el primer numero: ");
        n1 = leer.nextDouble();
    System.out.println("Digite el segundo numero: ");
        n2 = leer.nextDouble();
}

public void sumar (double x, double y){
     System.out.println("La suma de los numeros es: "+(n1+n2));
}
public void restar (double x, double y){
     System.out.println("La resta de los numeros es: "+(n1-n2));
}
public void multiplicar (double x, double y){
     System.out.println("La multiplicacion de los numeros es: "+(n1*n2));
}
public void dividir (double x, double y){
     System.out.println("La division de los numeros es: "+(n1/n2));
}

public void mostrarmenu (){
    do{
        System.out.println("*********************************");
        System.out.println("*   Operacion con numeros       *");
        System.out.println("*********************************");
        System.out.println("* 1- Leer numeros                *");
        System.out.println("* 2- Mostrar suma               *");
        System.out.println("* 3- Mostrar resta              *");
        System.out.println("* 4- Mostrar multiplicacion     *");
        System.out.println("* 5- Mostrar division           *");
        System.out.println("* 6- Salir                      *");
        System.out.println("*********************************");
        System.out.println("Digite la opcion que desea: ");
        opcion = leer.nextInt();
        switch(opcion){
            case 1 -> leer();
            case 2 -> sumar (n1,n2);
            case 3 -> restar (n1,n2);
            case 4 -> multiplicar (n1,n2);
            case 5 -> dividir (n1,n2);
            case 6 -> {
            }
            default -> {
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
    } while (opcion != 6);
}



    public static void main(String[] args) {
        Ejercicio7 llamar = new Ejercicio7();
        
        llamar.mostrarmenu();
    }
}
