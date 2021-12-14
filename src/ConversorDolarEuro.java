import java.util.Locale;
import java.util.Scanner;

public class ConversorDolarEuro {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorEuro = 0.88, valorDolar, valorMoeda;

        System.out.print("Informe o valor em DOLAR para a conversão em EURO: ");
        valorDolar = objIn.nextDouble();

        valorMoeda = valorDolar * valorEuro;

        System.out.println();
        System.out.println("Cotação atual do EURO: " + valorEuro);
        System.out.println("-----------------------------------");
        System.out.println("VALOR EM DOLAR: U$" + valorDolar);
        System.out.println("VALOR EM EURO: €" + String.format("%.2f", valorMoeda));

    }
}
