import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
*/
public class TP01Ex08{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite o número de milhas maritimas:");
        double m = ler.nextDouble();

        double km = m * 1.852;
        System.out.println("Ao todo " + m + "milhas maritimas sao " + km + "km");
    }
}