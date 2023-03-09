import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
*/

public class TP01Ex01{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione a base: ");
        double b = ler.nextDouble();

        System.out.print("Adicione a altura: ");
        double h = ler.nextDouble();

        double a = b * h;
        System.out.println("Area do retangulo: " + a);
    }
}