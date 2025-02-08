package Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        /*
        * IF e ELSE - Condições
        * ELSEIF
        * Objetivo da aula: Passar o ninja de nível de acordo com o numero de missoes
        * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;

        // se (condição) {faça isso}
        if(numeroDeMissoes == 10 && idade > 15){
            System.out.println("Naruto: Chunnin");
        } else if(numeroDeMissoes >= 20){
            System.out.println("Naruto: Jonnin");
        } else{
            System.out.println("Naruto: Gennin");
        }
    }
}
