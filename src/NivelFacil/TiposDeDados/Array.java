package TiposDeDados;

public class Array {
    public static void main(String[] args) {
        //Arrays são tipos referencias
        String[] ninja = new String[3];
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        //Array 2d
        String[][] ninjasEAldeia = new String[3][3];
        ninjasEAldeia[0][0] = "KONOHA";
        ninjasEAldeia[0][1] = "Sasuke";
        ninjasEAldeia[0][2] = "Naruto";

        ninjasEAldeia[1][0] = "Aldeia da nevoa";
        ninjasEAldeia[1][1] = "Zabuza";
        ninjasEAldeia[1][2] = "Hakuna";

        ninjasEAldeia[2][0] = "Deserto";
        ninjasEAldeia[2][1] = "Gaara";
        ninjasEAldeia[2][2] = "Temari";
    }
}
