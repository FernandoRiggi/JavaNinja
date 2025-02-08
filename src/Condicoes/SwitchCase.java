package Condicoes;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * SwitchCases: Servem para gerar casos especificos
        * Obejtivos: Pedir pro usuario escolher entre os ninjas
        * */

        //Pedir pro usuario

        //mostrar opções para o usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Sakura Haruno");
        //pedir pro usuario escolher uma
        System.out.println("Entre com o número do ninja: ");
        int opcao = scanner.nextInt();
        //Reação da escolha do usuario
        switch (opcao) {
            case 1:
                System.out.println("O usuario escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu Sakura Haruno");
                break;
                default:
                    System.out.println("Opcao invalida");
        }}
}
