import java.util.Scanner;
import java.lang.Math;
// Ronald Pereira e Isabela Rocha
/* 
16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
*/
public class TP01Ex16 {
    static Scanner ler = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.print("Insira o angulo que deseja calcular: ");
        double ang = ler.nextDouble();
        
        double rad = Math.toRadians(ang);
        double seno = Math.sin(rad);
        double coss = Math.cos(rad);
        double tang = Math.tan(rad);

        System.out.println("Os valores de Radianos, Seno, Cosseno e tangente respectivamente: ");
        System.out.println("Radianos: " + rad);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + coss);
        System.out.println("Tangente: " + tang);

        //Não entendemos o que é secante.
    }
}