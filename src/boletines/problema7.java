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
public class problema7 {
    
public static void main(String[] args) {
 int n1,n2;
 
 //Pedir dos números y decir cual es el mayor.
          Scanner Entrada=new Scanner (System.in);

 System.out.print("Introduce un número: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro número: ");
 n2=Entrada.nextInt();
 
 // si ambos números son iguales diría que n2 es mayor que n1
 if(n1>n2)
 System.out.println(n1 + " es mayor que " + n2);
 else
 System.out.println(n2 + " es mayor que " + n1); 
 }
}

