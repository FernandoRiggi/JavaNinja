package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Ternarios: São maneiras de reduzir o código
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 9;
        String nivel = (numeroDeMissoes >= 10) ? "Este ninja tem mais de 10 missões" : "Este ninja tem menos q 10 missoes";
        System.out.println(nivel);
    }
}
