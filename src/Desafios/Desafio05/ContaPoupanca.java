package Desafios.Desafio05;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    //Sobrecarga
    public ContaPoupanca(double saldo, TipoConta tipo) {
        super(saldo, TipoConta.POUPANCA);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$" + getSaldo());
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor*0.99));
        System.out.println("Deposito no valor de R$ " + valor + " realizado com sucesso!");
    }
}
