import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/
public class TP01Ex09{
    static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite a resistência eletrica: ");
        double r = ler.nextDouble();

        System.out.print("Digite a corrente eletrica: ");
        double i = ler.nextDouble();
        
        double u = r * i;

        System.out.println("A tensão eletrica: " + u);
    }
}