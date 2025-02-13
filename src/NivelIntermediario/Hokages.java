package NivelIntermediario;

public abstract class  Hokages {

    String nome;
    int idade;
    boolean vivoOuMorto;


    public abstract void sabedoria();

    public abstract void teste();
    //NoArgs Constructor
    public Hokages(){
        //Contrutor Vazio, sem argumentos
    }

    //AllArgs Constructor
    public Hokages(String nome, int idade, boolean vivoOuMorto){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;
    }


}
