package beecrowd.LogicaDeProgramacaoBasica_CondicionaisLacosVariaveis;


// Leia a hora inicial e a hora final de um jogo.
// A seguir, calcule a duração do jogo, sabendo que ele pode começar em um dia e terminar em outro,
// tendo uma duração mínima de 1 hora e máxima de 24 horas.
//
// Entrada:
// A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
//
// Saída:
// Apresente a duração do jogo conforme o exemplo abaixo.
//
// Exemplo de Entrada       Exemplo de Saída
// 16 2                    O JOGO DUROU 10 HORA(S)
// 0 0                     O JOGO DUROU 24 HORA(S)
// 2 16                    O JOGO DUROU 14 HORA(S)


import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class TempoDeJogo1046 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        int duracao;

        if(horaInicial > horaFinal){
            duracao = 24 - horaInicial + horaFinal;
        } else if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else{
            duracao = 24;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");



        scanner.close();
    }

}