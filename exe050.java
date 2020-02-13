
/*
 *  Luis Ramon
 *  Sebastiã
 */

package app; // Pacote que está sendo usado
import java.util.Scanner; // Importando a classe Scanner

/**
 * 5) Faça um sistema que realize o somatório dos números no intervalo determinado pelo usuário.
 * Peça para o usuário definir o início e o final da contagem.( 2 Pontos )
 * exe05
 */
public class exe05 { // Nome da Classe

    static Scanner sc = new Scanner(System.in); // Instanciado Scanner
    public static void main(String[] args) { // Metodo principal

        int soma = 0; // Criando a variavel soma e atribuindo o valor 0
        int ini = 0; // Criando a variavel inicio com o valor 0
        int fim = 0; // Criando a variavel fim com o valor 0

        System.out.print("Informe o primeiro numero: "); // pedindo o primeiro valor
        ini = sc.nextInt(); // Pegando o valor incial

        System.out.print("Informe o primeiro numero: "); // pedindo o segondo valor
        fim = sc.nextInt(); // Pegando o valor final

        for(; ini <= fim; ini++){ // Laço que irá realizar a somatoria
            soma = soma + ini; // Variavel recebendo a somatoria
        }
        System.out.printf("O somatorio é -> " + soma); // Mostrando a somatoria
    }
}