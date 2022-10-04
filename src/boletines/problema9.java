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
public class problema9 {
    
public static void main(String[] args) {
 
//Pedir dos números y mostrarlos ordenados de mayor a menor.

                 Scanner Entrada=new Scanner (System.in);

    int n1,n2;
System.out.print("Introduce un numero: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro numero: ");
 n2=Entrada.nextInt();
 
 if(n1>n2)
 System.out.println(n1 + " y " + n2);
 else
 System.out.println(n2 + " y " + n1); 
 }
}
