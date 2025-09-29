package problemsolving.others;

public class DistanciaSimples {

    public static int distanciaSimples(String palavra1, String palavra2){
        int contador = 0;
        int i = 0;

        while(i < palavra1.length() && i < palavra2.length()){

            if(palavra1.charAt(i) != palavra2.charAt(i)){
                contador+=1;
            }
            i++;
        }
        contador += Math.abs(palavra1.length() - palavra2.length());

        return contador;
    }

    public static void main(String[] args) {
        System.out.println(distanciaSimples("kitten", "sitting")); // Saída esperada: 3
    }
}
