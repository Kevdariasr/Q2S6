package com.mycompany.ejercicio5;
public class Ejercicio5 {

    public void mostrar (){
        for (int i = 1 ; i <= 10; i++){
            if (i % 2 !=0) System.out.println(i*i);
        }
    }
    
    public static void main(String[] args) {
        Ejercicio5 llamar=new Ejercicio5();
        llamar.mostrar();
    }
}
