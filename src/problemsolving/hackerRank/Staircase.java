package problemsSolving.hackerRank;

public class Staircase {

    public static void staircase(int n) {

        int numeroEspacoInicial = n - 1;
        int numeroJogoDaVelhaInicial = 1;

        for(int i = 0; i < n; i++){

            String linha = "";

            for(int j = 0; j < numeroEspacoInicial; j++){
                linha += " ";
            }

            for(int k = 0; k < numeroJogoDaVelhaInicial; k++){
                linha += "#";
            }

            numeroEspacoInicial -= 1;
            numeroJogoDaVelhaInicial += 1;

            System.out.println(linha);
        }

    }
}
