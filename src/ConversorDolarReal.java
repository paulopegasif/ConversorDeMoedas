import java.util.Locale;
import java.util.Scanner;

public class ConversorDolarReal {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorReal = 5.67, valorDolar, valorMoeda;

        System.out.print("Informe o valor em DOLAR para a conversão em REAL: ");
        valorDolar = objIn.nextDouble();

        valorMoeda = valorDolar * valorReal;

        System.out.println();
        System.out.println("Cotação atual do REAL: " + valorReal);
        System.out.println("-----------------------------------");
        System.out.println("VALOR EM DOLAR: U$" + valorDolar);
        System.out.println("VALOR EM REAL: R$" + String.format("%.2f", valorMoeda));

    }
}
