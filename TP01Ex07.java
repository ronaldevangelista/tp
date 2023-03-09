import java.util.Scanner;
import java.lang.Math;
// Ronald Pereira e Isabela Rocha
/* 
7. Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
*/
public class TP01Ex07{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione o primeiro valor: ");
        double v1 = ler.nextDouble();
        
        System.out.print("Adicione o segundo valor: ");
        double v2 = ler.nextDouble();

        double mg = Math.sqrt((v1 * v2));
        System.out.println("Media geometrica: " + mg);
    }
}