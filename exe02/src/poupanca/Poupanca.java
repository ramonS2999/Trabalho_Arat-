package poupanca;
import conta.ContaBancaria;

/**
 * Entites
 */
public class Poupanca extends ContaBancaria {

    @Override
    public void sacar(double sacar) {
        // TODO Auto-generated method stub
        saldo = saldo - sacar;
    }

    @Override
    public void deposito(double deposito) {
        // TODO Auto-generated method stub
        saldo = saldo + deposito;
    }

    public int getNumeroDaConta () {
        return numeroDaConta;
    }

    public void setNumeroDaConta (int numeroDaConta) {
       this.numeroDaConta = numeroDaConta;
    }

    public String toString() {
        return "Número: "
               + getNumeroDaConta ()
               + "\nSaldo: "
               + saldo
               + "\n";
    }
}