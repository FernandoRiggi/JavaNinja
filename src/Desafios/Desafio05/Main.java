package Desafios.Desafio05;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        BancoKonoha banco = new BancoKonoha();

        // Criando contas
        ContaPoupanca poupancaNaruto = new ContaPoupanca(5000);
        ContaCorrente correnteNaruto = new ContaCorrente(500);

        // Exibindo saldo inicial e realizando operações
        System.out.println("------- Conta Corrente do Naruto -------");
        correnteNaruto.consultarSaldo();
        correnteNaruto.depositar(200);
        correnteNaruto.consultarSaldo();

        System.out.println("\n------- Conta Poupança do Naruto -------");
        poupancaNaruto.consultarSaldo();
        poupancaNaruto.depositar(1000);
        poupancaNaruto.consultarSaldo();

        // Testando transferência entre contas pelo banco
        System.out.println("\n------- Realizar Transferência -------");
        banco.transferir(correnteNaruto, poupancaNaruto, 300);

        // Exibindo saldo após a transferência
        System.out.println("\n------- Saldos Após Transferência -------");
        correnteNaruto.consultarSaldo();
        poupancaNaruto.consultarSaldo();
    }
}