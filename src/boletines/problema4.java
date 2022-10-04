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
public class problema4 {
    
public static void main(String[] args) {
 int n1,n2;
 
     Scanner Entrada=new Scanner (System.in);
//Pedir dos números y decir si son iguales o no.
 System.out.print("Introduce un numero: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro numero: ");
 n2=Entrada.nextInt();
 if(n1==n2)
 System.out.println("Son iguales");
 else
 System.out.println("No son iguales");
 }
}
    

