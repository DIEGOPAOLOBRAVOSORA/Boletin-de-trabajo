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
public class ejercicio3 {
    //Pedir el radio de una circunferencia y calcular su longitud.
public static void main(String[] args) {
 double l,r; // longitud y radio
 
       Scanner Entrada=new Scanner (System.in);

 System.out.print("Introduce el radio de una circunferencia: ");
 r=Entrada.nextInt();
 l=2*Math.PI*r;
 
 System.out.println("La longitud de una circunferencia de radio " + r+ " es: " + l);
 }
}
