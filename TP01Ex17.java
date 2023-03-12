import java.util.Scanner;
import java.lang.Math;
// Ronald Pereira e Isabela Rocha
/* 
17. Entrar via teclado com dois valores quaisquer "X" e "Y". Calcular e exibir o
cálculo XY ("X" elevado a "Y"). Pesquisar as funções Exp e Ln.
*/
public class TP01Ex17 {
    static Scanner ler = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.print("Digite o valor de X: ");
        double x = ler.nextDouble();
        System.out.print("Insira o valor de Y: ");
        double y = ler.nextDouble();

        double result = Math.pow(x, y);
        System.out.println("O resultado é: " + result);
    }
}