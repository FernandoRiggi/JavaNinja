package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados Não Primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja e atribuir metodos pra ele
        * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase coloca tudo em upper
        System.out.println("Esse texto está em CAPSLOCK " + nomeUpperCase);
        System.out.println(nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); //toLowerCase cola tudo em lower
        System.out.println(aldeiaLowerCase);
    }
}
