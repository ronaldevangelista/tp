import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
*/
public class TP01Ex03{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione a diagonal: ");
        double d = ler.nextDouble();

        double area = d * d / 2;

        System.out.println("Area do quadrado: " + area);
    }
}