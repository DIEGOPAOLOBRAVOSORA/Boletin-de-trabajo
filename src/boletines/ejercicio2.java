/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletines;

import java.util.Scanner;

/**
 *
 * @author DieGo
 */
public class ejercicio2 {
    //Pedir el radio de un círculo y calcular su área. A=PI*r^2.
public static void main(String[] args) {

    double a,r; // área y radio
       Scanner entrada=new Scanner (System.in);

System.out.print("Introduce el radio de un circulo: ");
r=entrada.nextInt();
a=Math.PI*(r*r); // para elevar al cuadrado otra opción es: Math.pow (r, 2)
System.out.println("El area de una circunferencia de radio " + r+ " es: " + a);
}
}
