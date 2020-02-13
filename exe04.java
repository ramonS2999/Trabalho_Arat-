/*
 *  Luis Ramon
 *  Sebastiã
 */
package app; // Pacote que está sendo usado

/**
 * 4) Desenvolva um sistema que realize o somatório dos números de 1 até 100. (2 pontos )
 *
 * exe04
 */
public class exe04 { // Nome da Classe

    public static void main(String[] args) { // Metodo principal

        int soma = 0; // Criando a variavel soma e atribuindo o valor 0

        for(int x = 0; x <= 100; x++){ // Laço que irá realizar a somatoria
            soma = soma + x; // Variavel recebendo a somatoria
        }
        System.out.printf("O somatorio é -> " + soma); // Mostrando a somatoria
    }
}
