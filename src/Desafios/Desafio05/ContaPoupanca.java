package Desafios.Desafio05;

public class ContaPoupanca extends ContaBancaria implements ReceberTransferencia{
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
        if(getSaldo() >= valor){
            setSaldo(getSaldo() + (valor*0.99));
            System.out.println("Deposito no valor de R$ " + valor + " realizado com sucesso!");
        }
        else System.out.println("Saldo insuficiente!");
    }

    @Override
    public void receberTransferencia(double valor){
        setSaldo(getSaldo()-valor);
    }
}
