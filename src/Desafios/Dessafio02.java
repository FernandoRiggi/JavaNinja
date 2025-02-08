package Desafios;

import java.util.Scanner;

public class Dessafio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        int numeroMaximoNinja;
        System.out.println("Entre com a quantidade de ninjas que deseja adicionar: ");
        numeroMaximoNinja = entrada.nextInt();
        String[] ninja = new String[numeroMaximoNinja + 10]; //caso o user queira adicionar mais e não sabia na hora
        while (opc != 3) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opc = entrada.nextInt();
            entrada.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Entrando no menu Cadastrar Ninja");
                    for (int i = 0; i < numeroMaximoNinja; i++) {
                        System.out.println("Entre com o nome do ninja que deseja adicionar: ");
                        ninja[i] = entrada.nextLine();
                    }
                    break;
                case 2:
                    System.out.println("Entrando no menu Listar Ninjas");
                    if(numeroMaximoNinja!=0){
                        for(int i=0; i <numeroMaximoNinja; i++){
                            System.out.println("Nome do ninja "+i+":  " + ninja[i]);
                        }
                        break;
                    }
                case 3:
                    System.out.println("Encerrando programa");
                    System.exit(0);
                default:
                    System.out.println("Não há ninjas cadastrados!");
                    break;

                }
            }
        }
    }



