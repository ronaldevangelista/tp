import java.util.Scanner;
// Ronald Pereira e Isabela Rocha
/* 
18. Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
*/
public class TP01Ex18 {
    static Scanner ler = new Scanner (System.in);
    public static void main (String[] args) {
        double[] valor = new double[5];

        for (int y = 0; y <= 4; y++) {
            System.out.print("Insira o valor do " + (y + 1) + " produto: ");
            valor[y] = ler.nextDouble();
        }

        double soma = 0;

        for (int y = 0; y <= 4; y++){
            soma = soma + valor[y];    
        }

        System.out.println("O valor a ser pago e de: " + soma);
        System.out.print("Insira o valor que ira pagar: ");
        double pag = ler.nextDouble();

        System.out.println("O troco será de: R$ " + (pag - soma));
        
    }
}