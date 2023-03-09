import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
10. Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
*/
public class TP01Ex10{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite a temperatura em celsius: ");
        double c = ler.nextDouble();

        double f = (c * 1.8) + 32;
        System.out.print(c + " celsius e igual a: " + f + " fahrenheit");
    }
}