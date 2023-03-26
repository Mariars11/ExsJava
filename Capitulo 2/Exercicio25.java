package capitulo2.exercicio25;

import java.util.*;

/**
 Ímpar ou par) Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é ímpar ou par. [Dica: utilize o operador
de resto. Um número par é um múltiplo de 2. Qualquer múltiplo de 2 deixa um resto 0 quando dividido por 2.]
 */
public class Exercicio25 {

    public static void main(String[] args) {
        int numero;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        numero = scan.nextInt();
        
        if((numero % 2) == 0){
            System.out.printf("O número %d é par!", numero);
        } else  System.out.printf("O número %d é ímpar!", numero);
    }
}
