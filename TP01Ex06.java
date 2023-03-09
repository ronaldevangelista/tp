import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
6. Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
*/
public class TP01Ex06{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione o primeiro valor: ");
        double v1 = ler.nextDouble();
        
        System.out.print("Adicione o segundo valor: ");
        double v2 = ler.nextDouble();

        System.out.print("Adicione o terceiro valor: ");
        double v3 = ler.nextDouble();

        System.out.print("Adicione o quarto valor: ");
        double v4 = ler.nextDouble();

        double ma = (v1 + v2 + v3 + v4) / 4;
        System.out.println("Media aritmetica: " + ma);
    }
}