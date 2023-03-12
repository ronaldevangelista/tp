import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
14. Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
"r" inscrita em um cubo perfeito de aresta "a". Os valores de "r" e "a" serão
digitados.
*/
public class TP01Ex14 {
    static Scanner ler = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.print("Digite o valor do raio da esfera: ");
        double r = ler.nextDouble();

        System.out.print("Digite o valor da aresta do cubo: ");
        double a = ler.nextDouble();

        double volume_cubo = a * a * a;
        System.out.println("O volume do cubo: " + volume_cubo + " metros");

        double volume_esfera = (4 / 3) * 3.14 * (r * r * r);
        System.out.println("O volume da esfera: " + volume_esfera + " metros");

        double volume_livre = volume_cubo - volume_esfera;
        System.out.println("O volume livre no cubo: " + volume_livre + " metros");
    }
}