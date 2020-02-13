/*
 *  Luis Ramon
 *  Sebastiã
 */

package app; // Nome do pacote

import java.util.Scanner; // Import a biblioteca Scanner
/**
 * 2) Desenvolva um sistema que peça a idade do seu Primo e a idade da sua Tia. Em seguida,
 * imprima as informações a seguir: ( 2 pontos )
 * - a idade do seu primo
 * - a idade da sua tia
 * - minha tia tem < anos > de idade a mais que meu primo.
 *
 * exe02
 */
public class exe02 { // Nome da classe

    static Scanner sc = new Scanner(System.in); // Cria uma instancia de Scanner

    public static void main(String[] args) { // Metodo principal

        int soma = 0; // Inicializa a variavel (soma) com valor 0

        System.out.printf("Informe a idade da Tia: "); // Solicita a idade da Tia
        int tia = sc.nextInt(); // Pega a idade da Tia

        System.out.printf("Informe a idade do Primo: "); // Solicita a idade o Primo
        int primo = sc.nextInt(); // Pega a idade do Primo

        soma = tia - primo; // faz a soma da difernça das idades

        System.out.println("Minha Tia tem < " + soma + " > anos a mais que meu Primo!"); // Mostra a diferença das idades.

    }
}
