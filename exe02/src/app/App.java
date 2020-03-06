package app;
/**
 * Crie uma classe abstrata Conta Bancaria que contem como atributos o número da conta
 * e o saldo, e como métodos abstratos sacar e depositar que recebem um parâmetro do 
 * tipo double.
 */
import java.util.Scanner;
import poupanca.Poupanca;
public class App {
    public static void main(String[] args) throws Exception {
        Poupanca conta = new Poupanca();
        Scanner sc = new Scanner(System.in);

        double variavel = 0.0;

        System.out.println("\t\t ____________________");
        System.out.println("\t\t|  Número da conta   |");
        System.out.print("\t\t|____________________|");
        int numero = sc.nextInt();
        conta.setNumeroDaConta (numero);

        int opcao = 3;
        while (opcao != 0) {
            System.out.println("\t\t ____________________");
            System.out.println("\t\t| Informe a operação |");
            System.out.println("\t\t|____________________|");
            System.out.println("\t\t|0: Sair             | ");
            System.out.println("\t\t|____________________|");
            System.out.println("\t\t|1: Sacar            |");
            System.out.println("\t\t|____________________|");
            System.out.println("\t\t|2: Deposito         |");
            System.out.print("\t\t|____________________|");
            opcao = sc.nextInt();

            if (opcao == 2) {
                System.out.println("\t\t ____________________");
                System.out.println("\t\t|      Depositar     |");
                System.out.print("\t\t|____________________|");
                variavel = sc.nextDouble();
                conta.deposito(variavel);
            }
            else if ( opcao == 1) {
                System.out.println("\t\t ____________________");
                System.out.println("\t\t|        Sacar       |");
                System.out.print("\t\t|____________________|");
                variavel = sc.nextDouble();
                conta.sacar(variavel);
            }
            else if ( opcao != 0) {
                System.out.println("\t\t ________________________");
                System.out.println("\t\t| Digite um valor valido |");
                System.out.print("\t\t|________________________|");
            }
        }

        System.out.println(conta);
        System.out.println("\t\t ____________________");
        System.out.println("\t\t|        Saiu        |");
        System.out.print("\t\t|____________________|");

        sc.close();
    }
}
