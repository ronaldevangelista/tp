import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
*/
public class TP01Ex15 {
    static Scanner ler = new Scanner (System.in);
    public static void main (String[] args) {
        System.out.print("Insira o valor do dolar atual: ");
        float cot = ler.nextFloat();

        System.out.print("Insira quantos dolares desejas converter: ");
        float dol = ler.nextFloat();

        float real = cot * dol;
        System.out.println("Ao todo foram convertidos R$ " + real);
    }
}