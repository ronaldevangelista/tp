import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
*/
public class TP01Ex05{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Adicione o diametro de uma esfera: ");
        double d = ler.nextDouble();
        double ray = d / 2;
        double vol = (4/3) * 3.14 * ray;

        System.out.println("Volume da esfera: " + vol);
    }
}