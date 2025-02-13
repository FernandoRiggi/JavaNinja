package Desafios.Desafio05;

public abstract class ContaBancaria implements Conta {

    private TipoConta tipo;

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //Sobrecarga com Tipo da Conta
    public ContaBancaria(double saldo, TipoConta tipo) {
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public void consultarSaldo() {
    }

    public void depositar(double valor) {
    }

}
