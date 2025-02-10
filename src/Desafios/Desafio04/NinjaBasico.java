package Desafios.Desafio04;

public class NinjaBasico implements Ninja {


    private String nome;

    private int idade;

    private String habilidade;

    private TipoHabilidade tipoHabilidade;


    public NinjaBasico() {
    }

    public void setTipoHabilidade(TipoHabilidade tipoHabilidade) {
        this.tipoHabilidade = tipoHabilidade;
    }

    public TipoHabilidade getTipoHabilidade() {
        return tipoHabilidade;
    }

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoHabilidade = tipoHabilidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome do ninja: " + getNome());
        System.out.println("Idade do ninja: " + getIdade());
        System.out.println("Tipo da habilidade básica: " + tipoHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Realizei um ataque básico utilizando: " + getHabilidade());
    }

}
