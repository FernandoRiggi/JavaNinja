package Desafios;

import java.util.Scanner;

public class Dessafio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opc = 0;
        int numeroMaximoNinja;
        int ninjasCadastrados =0;
        System.out.println("Entre com a quantidade de ninjas que deseja adicionar: ");
        numeroMaximoNinja = entrada.nextInt();
        String[] ninja = new String[numeroMaximoNinja];
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
                    if (ninjasCadastrados < numeroMaximoNinja) {
                        for (int i = 0; i < numeroMaximoNinja; i++) {
                            System.out.println("Entre com o nome do ninja que deseja adicionar: ");
                            ninja[i] = entrada.nextLine();
                            ninjasCadastrados++;
                        }
                    }else{
                        System.out.println("A lista de ninja já está cheia");
                    }
                    break;
                case 2:
                    System.out.println("Entrando no menu Listar Ninjas");
                    if(numeroMaximoNinja!=0){
                        for(int i=0; i <numeroMaximoNinja; i++){
                            System.out.println("Nome do ninja "+i+":  " + ninja[i]);
                        }
                    }
                    else{
                        System.out.println("Não há nninjas cadastrados");
                    }
                    break;
                case 3:
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("Não há ninjas cadastrados!");
                    break;
                }
            }
        }
    }



