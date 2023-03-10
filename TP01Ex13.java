import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.
*/
public class TP01Ex13 {
    static Scanner ler = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.print("Digite o valor da velocidade inicial:");
        double vi = ler.nextDouble();

        System.out.print("Digite o valor da aceleracao por segundo: ");
        double at = ler.nextDouble();

        System.out.print("Digite o periodo do percurso: ");
        double tp = ler.nextDouble();

        double vf = (at * tp) + vi;
        System.out.println("O valor da velocidade final: " + vf);
    }
}