package Desafios;

public class DESAFIO01 {
    public static void main(String[] args) {
        /*
        * OBJETIVO: Crie um programa que represente três ninjas da Vila da Folha (Konoha) de "Naruto" e suas respectivas missões.
            Cada ninja tem um nome, uma idade e uma missão atribuída a ele, com o nome da missão, nível de dificuldade e status de conclusão
        * */

        //Criação Ninjas
        String[] nome = {"Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno"};
        int[] idade = {16, 16, 14};
        String[] missao = {"Proteção do Daimyō ", "Infiltração na Nuvem ", "Resgate de Refém "};
        char[] nivelMissao = {'A', 'S', 'B'};
        boolean[] conclusaoMissao = new boolean[nome.length];

        for(int i =0; i<nome.length; i++){
            System.out.println("----------------------------------");
            System.out.println("Nome do ninja: " + nome[i]);
            System.out.println("Idade do ninja: " + idade[i]);
            System.out.println("Missao do ninja: " + missao[i]);
            System.out.println("Rank da missao: " + nivelMissao[i]);
            if(idade[i]< 15) {
                if (nivelMissao[i] == 'C' || nivelMissao[i] == 'D') {
                    System.out.println("O ninja: " + nome[i] + " realizou a missão: " + missao[i]);
                    conclusaoMissao[i] = true;
                } else{
                    System.out.println("Missão não concluída");
                    System.out.println("Motivo: Idade insuficiente para realizar missões maiores que rank C");
                    conclusaoMissao[i] = false;
                }
            }else{
                System.out.println("O ninja: " + nome[i] + " realizou a missão: " + missao[i]);
                conclusaoMissao[i] = true;
            }
        }
    }
}
