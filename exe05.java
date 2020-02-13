/*
 *  Luis Ramon
 *  Sebastiã
 */
package app;

import java.util.Scanner; // importa a biblioteca Scanner
/**
 * 6) João deseja fazer um sistema que solicita para a pessoa digitar um númeor qualquer,
 * posteriormente, realize a soma de todos os algarismos deste mesmo número. ( 2 pontos )
 * 2222 = 2+2+2+2 = 8
 * 3197 = 3+1+9+7 = 20
 * exe05
 */
public class exe05 { // Nome da classe

    static Scanner sc = new Scanner(System.in); // cria uma instancia de Scanner

    public static void main(String[] args) { // Metodo principal
        
        int soma = 0; // Irá receber a soma dos número
        int milhar = 0; // Irá receber o valor de Milhar
        int centena = 0; // Irá receber o valor da centena
        int dezena = 0; // Irá receber o valor da dezena

        System.out.printf("Digite o número: "); // solicitando o vaor
        int n = sc.nextInt(); // Pegando o valor solicitado

        milhar = n / 1000; // Pega apnas o valor o milhar
        n = n - (milhar * 1000); // Atribui o que sobrou a variavel (n)
   
        centena = n / 100; // Pega apnas o valor o centena
        n = n - (centena * 100); // Atribui o que sobrou a variavel (n)

        dezena = n / 10; // Pega apnas o valor o dezena
        n = n - (dezena * 10); // Atribui o que sobrou a variavel (n)


        soma = milhar + centena + dezena + n; // realiza o somatorio

        System.out.println(soma); // mostra o somatorio
    }
}
