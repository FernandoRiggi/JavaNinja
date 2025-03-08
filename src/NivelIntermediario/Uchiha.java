package NivelIntermediario;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, String aldeia, int idade) {
        super(nome, rank, numeroDeMissoesConcluidas, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + ". E esse é o meu ataque Uchiha, um ataque de fogo");
    }
    /*
    * Metodo:
    * Implementa da interface Sharingan
    * */
    public void sharinganAtivado() {
        System.out.println(nome + ": Ativou o Sharingan");

    }
}
