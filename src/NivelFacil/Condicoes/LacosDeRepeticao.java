package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        *Lacos de Repetição: repete infinitamente até o parametro ser atendido
        *WHILE = FOR
        * */
        //While
        //while(condicoa) {Tudo vai acontecer}


        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while(numeroDeClones <= numeroMaximoDeClones) {
            System.out.println("O naruto fez um clone da sombra");
            numeroDeClones++;
        }
        //FOR
        for (int i = 0; i < numeroMaximoDeClones; i++) {
            System.out.println("O naruto fez um clone da sombra" + (i + 1));
        }
    }
}
