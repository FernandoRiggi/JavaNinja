package Desafios.Desafio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner= new Scanner(System.in);
        LinkedList<Ninja> listDeNinjas = new LinkedList<>();
        listDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        boolean loop = true;
        while(loop){
            System.out.println("s-------------Menu de ninjas--------------");
            System.out.println("1. Adicionar ninja no inicio");
            System.out.println("2. Remover ninja do inicio");
            System.out.println("3. Listar ninjas");
            System.out.println("4. Procurar ninja por indice");
            System.out.println("5. Sair");
            System.out.println("Entre com a opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Entre com o nome do ninja: ");
                    String nome = scanner.nextLine();
                    System.out.println("Entre com a idade do ninja: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Entre com a aldeia: ");
                    String aldeia = scanner.nextLine();
                    listDeNinjas.addFirst(new Ninja(nome, idade, aldeia));
                    break;
                case 2:
                    if(!listDeNinjas.isEmpty()){
                        System.out.println("Removendo o primeiro ninja da lista");
                        listDeNinjas.removeFirst();
                    }else System.out.println("Lista vazia");
                    break;
                case 3:
                    if(listDeNinjas.isEmpty()){
                        System.out.println("Lista vazia");
                        break;
                    }
                    int count = 0;
                    for (Ninja listDeNinja : listDeNinjas) {
                        System.out.println("Ninja " + count + ": " + listDeNinja);
                        count++;
                    }
                    break;
                case 4:
                    System.out.println("Entre com o index que deseja procurar: ");
                    int indice = scanner.nextInt();
                    if(indice>=0 && indice<listDeNinjas.size()){
                        System.out.println("Ninja do indice " + indice + ": " + listDeNinjas.get(indice));
                    }else System.out.println("Index invalido, Escolha entre 0 e " + (listDeNinjas.size()-1));
                    break;
                case 5:
                    System.out.println("Encerrando programa");
                    loop = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }

        }
        scanner.close();
    }
}
