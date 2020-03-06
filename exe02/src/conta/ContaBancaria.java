package conta;

/**
 * ContaBancaria
 */
public abstract class ContaBancaria {

    protected  int numeroDaConta;
    protected double saldo;
    
    public abstract void sacar(double sacar);
    public abstract void deposito(double deposito);
}