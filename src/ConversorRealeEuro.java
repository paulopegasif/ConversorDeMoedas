import java.util.Locale;
import java.util.Scanner;

public class ConversorRealeEuro {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorReal, valorEuro = 6.41;

        System.out.print("Informe o valor em REAL para a conversão em EURO: ");
        valorReal = objIn.nextDouble();

        valorEuro = valorReal / 6.41;

        System.out.println();
        System.out.println("VALOR EM REAIS: R$" + valorReal);
        System.out.println("VALOR EM DOLAR: U$" + String.format("%.2f", valorEuro));

    }
}
