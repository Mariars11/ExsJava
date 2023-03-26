/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package capitulo2.exercicio26;

import java.util.*;

/**
 (Múltiplos) Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro é um múltiplo do segundo e imprimir o resultado.
[Dica: utilize o operador de resto.]
 */
public class Exercicio26 {

    public static void main(String[] args) {
        int num1, num2;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o numero 1: ");
        num1 = scan.nextInt();
        
        System.out.print("Informe o numero 2: ");
        num2 = scan.nextInt();
        
        if((num1 % num2) == 0){
            System.out.printf("O número %d é multiplo de %d!", num1, num2);
        } else System.out.println("Não são múltiplos!");
    }
}
