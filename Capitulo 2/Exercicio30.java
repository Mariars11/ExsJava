/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package capitulo2.exercicio30;

import java.util.*;

/**
 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário,
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário
digitar o número 42339, o programa deve imprimir
 */
public class Exercicio30 {

    public static void main(String[] args) {
        int numero;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe um numero de 5 digitos: ");
        numero = scan.nextInt();
        
        int dezenaMilhar = numero/10000;
        int milhar = (numero % 10000) / 1000;
        int centena = ((numero % 10000) % 1000) / 100;
        int dezena = (((numero % 10000) % 1000) % 100) / 10;
        int unidade = ((((numero % 10000) % 1000) % 100) % 10) / 1;
        
        System.out.printf("Inteiro: %d\t%d\t%d\t%d\t%d", dezenaMilhar, milhar, centena, dezena, unidade);
    }
}
