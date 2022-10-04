/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletines;

import java.util.Scanner;

/**
 *
 * @author DieGO
 */
public class problema8 {
    

public static void main(String[] args) {
 int n1,n2;
 
 
 //Pedir dos números y decir cual es el mayor o si son iguales.
            
            Scanner Entrada=new Scanner (System.in);

 
 System.out.print("Introduce un número: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro número: ");
 n2=Entrada.nextInt();
 
 if(n1==n2)
 System.out.println("Son iguales");
 else
 {
 if(n1>n2)
 System.out.println(n1 + " es mayor que " + n2);
 else
 System.out.println(n2 + " es mayor que " + n1);
 }
 }
}


