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
public class problema5 {
    //Pedir un número e indicar si es positivo o negativo.

 public static void main(String[] args) {
 int num;
 
      Scanner Entrada=new Scanner (System.in);

 System.out.print("Introduce un numero: ");
 num=Entrada.nextInt();
 
 if( num < 0)
 System.out.println("Negativo");
 else
 // suponemos que el 0 es positivo.
 System.out.println("Positivo");
 }
}

