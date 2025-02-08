package Desafios.Desafio03;

public class Ninja {
    private String nome;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    private int idade;
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    private String missao;
    public String getMissao() {
        return missao;
    }
    public void setMissao(String missao) {
        this.missao = missao;
    }
    private String nivelDificuldade;
    public String getNivelDificuldade() {
        return nivelDificuldade;
    }
    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
    private String statusMissao;
    public String getStatusMissao() {
        return statusMissao;
    }
    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }
}
