/*
 *  Luis Ramon
 *  Sebastiã
 */
package app; // Pacote usado
import java.util.Scanner; // importando a classe Scanner
/**
 * 3) Desenvolva um sistema de login esenha. Solicitando ao usuário o seu login e armazene a
 * informação em uma variável. Posteriormente a sua senha e coloque-a em outra variável. Por
 * fim, verifique se o login e a senha são iguais àquele definido por você. ( 2 pontos )
 * exe03
 */
public class exe03 { // Nome da classe

    static Scanner sc = new Scanner(System.in); // Instanciando objeto Scanner

    public static void main(String[] args) { // Metodo principal

        System.out.println("Informe Login: "); // Pedindo o login
        String login = sc.nextLine(); // Pegando valor do login

        System.out.println("Informe Senha: "); // Pedindo a senha
        String senha = sc.nextLine(); // Pegando valor da senha

        System.out.println("LOGIN: "); // Pedindo o login novamente
        String login_1 = sc.nextLine(); // Pegando valor do login em outra variavel

        System.out.println("SENHA: "); // Pedindo a senha novamente
        String senha_1 = sc.nextLine(); // Pegando valor da senha em outra variavel

        if(login.compareTo(login_1) != 0){ // Comparando se os login são iguais
            System.out.println("LOGIN errado!"); // Mostrando erro de login
        }
        else if(senha.compareTo(senha_1) != 0){ // Comparando se as senha são iguais
            System.out.println("SENHA errada!"); // Mostrando erro de senha
        }
        else{ // A ultiuma alternativa
            System.out.println("Login e Senha correto!"); // Informando que a senha e login é correto
        }
    }
}
