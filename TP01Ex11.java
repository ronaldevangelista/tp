import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
*/
public class TP01Ex11{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o diametro do circulo: ");
        double d = ler.nextDouble();
        double ray = d / 2;
        double a = 3.14 * ray * ray;
        System.out.print("A area do circulo: " + a);
    }
}