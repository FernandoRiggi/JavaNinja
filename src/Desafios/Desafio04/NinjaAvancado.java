package Desafios.Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja {


    private String especialidade;


    public NinjaAvancado(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, String habilidade, TipoHabilidade tipoHabilidade, String especialidade) {
        super(nome, idade, habilidade, tipoHabilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Especialidade do ninja: " + this.getEspecialidade());
    }

    @Override
    public void executarHabilidade(){
        System.out.println("Realizei um ataque básico utilizando minha habilidade especial " + this.getEspecialidade());
    }
}
