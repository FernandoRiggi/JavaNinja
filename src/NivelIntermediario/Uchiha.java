package NivelIntermediario;

public class Uchiha extends Ninja{
    public void SharinganAtivado(){
        System.out.println("Meu nome é: " + nome + ". Sharingan Ativado, pois sou um Uchiha");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é: " + nome + ". E esse é o meu ataque Uchiha, um ataque de fogo");
    }
}
