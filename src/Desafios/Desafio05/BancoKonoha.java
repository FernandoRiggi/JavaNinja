package Desafios.Desafio05;

public class BancoKonoha {
    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (valor <= 0) System.out.println("Valor inválido para transferência");
        if (origem.getSaldo() < valor) System.out.println("Saldo insuficiente");

        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);
        System.out.println("Transferencia de R$: " + valor + " realizada com sucesso");
    }
    // Sobrecarga para transferência de ContaCorrente para ContaPoupanca
    public void transferir(ContaCorrente origem, ContaPoupanca destino, double valor) {
        transferir((ContaBancaria) origem, (ContaBancaria) destino, valor);
    }

    // Sobrecarga para transferência de ContaPoupanca para ContaCorrente
    public void transferir(ContaPoupanca origem, ContaCorrente destino, double valor) {
    transferir((ContaBancaria) origem, (ContaBancaria) destino, valor);
    }
}
