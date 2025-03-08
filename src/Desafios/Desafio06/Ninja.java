package Desafios.Desafio06;

public class Ninja {
    private String nome;
    private int idade;
    private String vila;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String vila) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public String getVila() {
        return vila;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", Idade=" + idade +
                ", Aldeia='" + vila + '\'';
    }
}
