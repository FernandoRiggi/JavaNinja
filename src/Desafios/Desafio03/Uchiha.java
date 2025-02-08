package Desafios.Desafio03;

public class Uchiha extends Ninja {
    private String habilidadeEspecial;
    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }
    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial(){
        System.out.println("Meu nome é: " + getNome() + ". Essa é a minha habilidade especial: " + getHabilidadeEspecial());
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial: " + habilidadeEspecial);
    }
}
