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
public class problema6 {
    
public static void main(String[] args) {
 int n1,n2;
 
      //Pedir dos números y decir si uno es múltiplo del otro. 

      Scanner Entrada=new Scanner (System.in);

 System.out.print("Introduce un numero: ");
 n1=Entrada.nextInt();
 System.out.print("Introduce otro numero: ");
 n2=Entrada.nextInt();
 if(n1%n2==0)
 System.out.println("Son multiplos");
 else
 System.out.println("No son multiplos");
 }
}

