import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
*/
public class TP01Ex02{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione aresta: ");
        double a = ler.nextDouble();

        double area = a * a;

        System.out.println("Area do quadrado: " + area);
    }
}