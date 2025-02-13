package Desafios.Desafio05;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    //Sobrecarga
    public ContaCorrente(double saldo, TipoConta tipo) {
        super(saldo, TipoConta.CORRENTE);
    }

    @Override
    public void consultarSaldo(){
        System.out.println("Saldo da Conta Corrente: R$" + getSaldo());
    }

    @Override
    public void depositar(double valor){
        setSaldo(getSaldo() + (valor*0.99));
        System.out.println("Deposito no valor de R$ " + valor + " realizado com sucesso!");
    }
}
