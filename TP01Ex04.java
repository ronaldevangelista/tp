import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
4. A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/
public class TP01Ex04{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione a altura do triângulo: ");
        double h = ler.nextDouble();

        System.out.print("Adicione a base do triângulo: ");
        double b = ler.nextDouble();

        double area = b * h / 2;

        System.out.println("Area do triângulo: " + area);
    }
}