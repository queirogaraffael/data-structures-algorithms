package problemsolving.others;

public class FrequenciaElemento {

    public static int contarFrequencia(int[] array, int elementoProcurado){

        int frequencia = 0;

        for(int elemento : array){
            if(elemento == elementoProcurado){
                frequencia += 1;
            }
        }

        return frequencia;
    }

    public static void main(String[] args) {
        int[] meuArray = {1, 2, 3, 4, 2, 3, 2};
        int elementoProcurado = 2;
        System.out.println(contarFrequencia(meuArray, elementoProcurado)); // Saída esperada: 3
    }
}
