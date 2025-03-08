package NivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //sobrecarga
    public Ninja(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, String aldeia, int idade) {
        this(nome, aldeia, idade);
        this.rank = rank;
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }
}
