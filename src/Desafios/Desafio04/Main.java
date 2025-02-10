package Desafios.Desafio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Você vai criar um programa que gerencia diferentes tipos de ninjas, cada um com suas habilidades e
        informações. O objetivo é utilizar interfaces e polimorfismo para lidar com diferentes tipos de ninja
        e suas habilidades. 1. Crie uma interface chamada Ninja com dois métodos: mostrarInformações() para mostrar
        detalhes do ninja e executarHabilidade() para fazer o ninja usar sua habilidade.
        * 2. Crie uma classe chamada NinjaBásico que implementa a interface Ninja.
        3. Crie uma classe chamada NinjaAvançado que também implementa a interface Ninja. Além dos
        atributos nome, idade e habilidade, esta classe deve ter um atributo adicional chamado especialidade (uma habilidade especial do ninja).
        4. Mostre as informações e execute as habilidades de cada ninja usando os métodos que você implementou.*/

        NinjaBasico Naruto = new NinjaBasico("Naruto", 16, "Rasengan", TipoHabilidade.NINJUTSU);
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();
        Scanner scanner = new Scanner(System.in);
        NinjaAvancado Kakashi = new NinjaAvancado("Kakashi", 40, "Invocação", TipoHabilidade.TAIJUTSU, "Sharingan");
        Kakashi.mostrarInformacoes();
        Kakashi.executarHabilidade();
        scanner.close();

    }
}
