package problemsolving.others;

public class SomarArray {

    public static int somarArray(String arrayComoString) {

        String[] valoresEmString = arrayComoString.split(",");
        int somaTotal = 0;

        for (String valorEmString : valoresEmString) {
            somaTotal += Integer.parseInt(valorEmString);
        }
        return somaTotal;

    }


    public static void main(String[] args) {
        String arrayComoString = "10,20,30,40,50";
        System.out.println(somarArray(arrayComoString)); // Saída esperada: 150
    }
}
