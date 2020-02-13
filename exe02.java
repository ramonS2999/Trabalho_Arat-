package app; // Nome do pacote

import java.util.Scanner; // Import a biblioteca Scanner
/**
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