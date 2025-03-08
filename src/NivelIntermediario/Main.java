package NivelIntermediario;

public class Main {
    public static void main(String[] args) {


        System.out.println("-----------Naruto Uzumaki-----------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", NivelNinja.GENIN, 15, "Aldeia da folha", 20, Biju.KURAMA );
        System.out.println(naruto.biju);

        System.out.println("-----------Sasuke Uchiha-----------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", NivelNinja.GENIN, 30, "Aldeia da folha",  20);
    sasuke.habilidadeEspecial();

        Senju hashirama = new Senju();
        hashirama.sabedoria();


    }
}
