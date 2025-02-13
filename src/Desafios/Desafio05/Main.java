package Desafios.Desafio05;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca poupancaNaruto = new ContaPoupanca(5000);
        ContaCorrente correnteNaruto = new ContaCorrente(500);
        System.out.println("-------Conta Corrente do Naruto-------");
        correnteNaruto.consultarSaldo();
        correnteNaruto.depositar(200);
        correnteNaruto.consultarSaldo();
        System.out.println("-------Conta Poupanca do Naruto------- ");
        poupancaNaruto.consultarSaldo();
        poupancaNaruto.depositar(1000);
        poupancaNaruto.consultarSaldo();
        System.out.println("-------Realizar Transferencia-------");
        correnteNaruto.transferirParaPoupanca(poupancaNaruto, 200);
        poupancaNaruto.consultarSaldo();
        correnteNaruto.consultarSaldo();
    }

}
