package Desafios.Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcMenuNinja = 0;
        System.out.println("entre com a quantidade de ninjas que deseja adicionar: ");
        int qtdNinjas = scanner.nextInt();
        scanner.nextLine();
        Ninja[] ninjas = new Ninja[qtdNinjas];
        Uchiha[] uchihas = new Uchiha[qtdNinjas];
        int ninjasCadastrados = 0;
        while(opcMenuNinja != 4) {
            System.out.println("-----------Menu de Ninjas-----------");
            System.out.println("1 - Adicionar Ninja");
            System.out.println("2 - Atualizar Habilidade especial do ninja");
            System.out.println("3 - Listar informações de todos os ninjas");
            System.out.println("4 - Sair");
            System.out.println("Digite um numero: ");
            opcMenuNinja = scanner.nextInt();
            scanner.nextLine();
            switch (opcMenuNinja) {
                case 1:
                    System.out.println("Entrando no menu de adicionar ninja");
                    if(ninjasCadastrados <qtdNinjas) {
                        for(int i=0; i<qtdNinjas; i++) {
                            System.out.println("Digite o nome do ninja " + (i+1) + ": ");
                            String nome = scanner.nextLine();
                            System.out.println("Entre com a idade do ninja " + (i+1) + ": ");
                            int idade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Entre com a Missão do ninja " + (i+1) + ": ");
                            String missao = scanner.nextLine();
                            System.out.println("Entre com o nivel de dificuldade da missão do ninja " + (i+1) + ": ");
                            String dificuldade = scanner.nextLine();
                            System.out.println("Entre com o status da missão do ninja " + (i+1) + ": ");
                            String status = scanner.nextLine();
                            char eUchiha = eUchiha(scanner);
                            scanner.nextLine();
                            if(eUchiha == 'S'|| eUchiha == 's') {
                                uchihas[i] = new Uchiha();
                                System.out.println("Entre com a habilidade especial do Uchiha");
                                String habilidadeEspecial = scanner.nextLine();
                                uchihas[i].setNome(nome);
                                uchihas[i].setIdade(idade);
                                uchihas[i].setMissao(missao);
                                uchihas[i].setNivelDificuldade(dificuldade);
                                uchihas[i].setStatusMissao(status);
                                uchihas[i].setHabilidadeEspecial(habilidadeEspecial);
                                ninjasCadastrados++;
                            } else{
                                ninjas[i] = new Ninja();
                                ninjas[i].setNome(nome);
                                ninjas[i].setIdade(idade);
                                ninjas[i].setMissao(missao);
                                ninjas[i].setNivelDificuldade(dificuldade);
                                ninjas[i].setStatusMissao(status);
                                ninjasCadastrados++;
                            }
                        }
                    }else{
                        System.out.println("A lista de ninjas já está cheia");
                    }
                    break;
                case 2:
                    System.out.println("Entrando no menu de atualizar habilidade especial do uchiha");
                    char eUchiha = eUchiha(scanner);
                    scanner.nextLine();
                    if(eUchiha == 'S'|| eUchiha == 's') {
                        System.out.println("Entre com o nome do seu Uchiha");
                        String nome = scanner.nextLine();
                        System.out.println("Entre com a habilidade especial do Uchiha");
                        String habilidadeEspecial = scanner.nextLine();
                        boolean achou = false;
                        for (Uchiha uchiha : uchihas) {
                            if (uchiha.getNome().equals(nome)) {
                                uchiha.setHabilidadeEspecial(habilidadeEspecial);
                                achou = true;
                                break;
                            }
                        }
                        String achouNinja = (achou) ? "A habilidade especial do ninja " + nome + " foi atualizada." : "Não foi possível encontrar o ninja";
                        System.out.println(achouNinja);
                    } else{
                        System.out.println("SEu ninja não é um uchiha");
                        break;
                    }
                    break;
                case 3:
                    System.out.println("Entrando no menu de listar todos os ninjas");
                    boolean temNinjas = false;
                    for(Ninja ninja : ninjas) {
                        if(ninja != null) {
                            ninja.mostrarInformacoes();
                            temNinjas = true;
                        }
                    }
                    for(Uchiha uchiha : uchihas) {
                        if(uchiha != null) {
                            uchiha.mostrarInformacoes();
                            temNinjas = true;
                        }
                    }
                    if(!temNinjas) {
                        System.out.println("Não há ninjas cadastrados");
                    }
                    break;
            }
        }
        scanner.close();

    }
    public static char eUchiha(Scanner scanner) {
        System.out.println("O seu ninja é um Uchiha? Se sim digite s, caso não digite n: ");
        return scanner.next().charAt(0);
    }
}

