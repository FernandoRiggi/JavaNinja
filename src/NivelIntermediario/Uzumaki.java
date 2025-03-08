package NivelIntermediario;

public class Uzumaki extends Ninja{

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, String aldeia, int idade) {
        super(nome, rank, numeroDeMissoesConcluidas, aldeia, idade);
    }

    public Uzumaki(String nome, NivelNinja rank, int numeroDeMissoesConcluidas, String aldeia, int idade, Biju biju) {
        super(nome, rank, numeroDeMissoesConcluidas, aldeia, idade);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + ". E esse é o meu ataque Uzumaki, um ataque de ar");
    }
}
