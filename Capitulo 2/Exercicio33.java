/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package capitulo2.exercicio33;

import java.util.*;

/**
 (Calculadora de índice de massa corporal) Introduzimos a calculadora de índice de massa corporal (IMC) no Exercício1.10. As fórmulas
para calcular o IMC são
* IMC = peso / altura²;
* 
* Underweight: less than 18.5
Normal: between 18.5 and 24.9
Overweight: between 25 and 29.9
Obese: 30 or greater
 */
public class Exercicio33 {

    public static void main(String[] args) {
        System.out.println("------------------------------");
        System.out.println("         IMC valores");
        System.out.println("------------------------------");
        System.out.println("  Abaixo do peso: menos de 18.5");
        System.out.println("  Normal: entre 18.5 e 24.9");
        System.out.println("  Acima do peso: entre 25 e 29.9");
        System.out.println("  Obeso: 30 ou maior");
        
        double peso, altura;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe peso: ");
        peso = scan.nextDouble();
        
        System.out.print("Informe altura: ");
        altura = scan.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.printf("O valor do IMC: %f", imc);
    }
}
