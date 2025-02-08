package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        //Criar Naruto como Objeto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da folha";
        Naruto.modoSabio();


        //Criar Sasuke como Objeto
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Aldeia da folha";
        //Ativando Sharingan no Sasuke
        Sasuke.SharinganAtivado();

        //Criar Sakura como Objeto
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da folha";
        Sakura.ativarCura();

        //Obejto Hinata
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 16;
        Hinata.aldeia = "Aldeia da folha";
        Hinata.byakuganAtivado();
    }
}
