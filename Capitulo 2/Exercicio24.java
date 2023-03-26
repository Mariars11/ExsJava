package capitulo2.exercicio24;

import java.util.*;

/**
 (Inteiros maiores e menores) Escreva um aplicativo que leia cinco inteiros, além de determinar e imprimir o maior e o menor inteiro
no grupo. Utilize somente as técnicas de programação que você aprendeu neste capítulo.
 */

public class Exercicio24 {

    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe o numero 1: ");
        num1 = scan.nextInt();
        System.out.print("Informe o numero 2: ");
        num2 = scan.nextInt();
        System.out.print("Informe o numero 3: ");
        num3 = scan.nextInt();
        System.out.print("Informe o numero 4: ");
        num4 = scan.nextInt();
        System.out.print("Informe o numero 5: ");
        num5 = scan.nextInt();
        
        System.out.print("\n");
        
        
        if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.printf("O numero: %d é o maior", num1);
        } else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.printf("O numero: %d é o maior", num2);
        } else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.printf("O numero: %d é o maior", num3);
        } else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.printf("O numero: %d é o maior", num4);
        } else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
            System.out.printf("O numero: %d é o maior", num5);
        } 
        System.out.print("\n");
        if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.printf("O numero: %d é o menor", num1);
        } else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.printf("O numero: %d é o menor", num2);
        } else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.printf("O numero: %d é o menor", num3);
        } else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.printf("O numero: %d é o menor", num4);
        } else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
            System.out.printf("O numero: %d é o menor", num5);
        } 
    }
}
