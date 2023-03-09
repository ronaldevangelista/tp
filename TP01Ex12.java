import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
12. Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
*/
public class TP01Ex12{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite a altura do cone: ");
        double h = ler.nextDouble();

        System.out.print("Digite o raio do cone: ");
        double ray = ler.nextDouble();
        double v = 0.33 * 3.14 * (ray * ray) * h;
        System.out.print("O volume do cone: " + v);
    }
}