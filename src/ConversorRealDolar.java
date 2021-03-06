import javax.swing.JOptionPane;
import java.util.Locale;
import java.util.Scanner;

public class ConversorRealDolar {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorReal, valorDolar = 5.68;

        System.out.print("Informe o valor em REAL para a conversão em DOLAR: ");
        valorReal = objIn.nextDouble();

        valorDolar = valorReal / 5.68;

        System.out.println();
        System.out.println("VALOR EM REAIS: R$" + valorReal);
        System.out.println("VALOR EM DOLAR: U$" + String.format("%.2f", valorDolar));

    }
}
