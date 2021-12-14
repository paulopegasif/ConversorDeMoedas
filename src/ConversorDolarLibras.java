import java.util.Locale;
import java.util.Scanner;

public class ConversorDolarLibras {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorLibras = 5.67, valorDolar, valorMoeda;

        System.out.print("Informe o valor em DOLAR para a conversão em LIBRAS: ");
        valorDolar = objIn.nextDouble();

        valorMoeda = valorDolar * valorLibras;

        System.out.println();
        System.out.println("Cotação atual da LIBRAS: " + valorLibras);
        System.out.println("-----------------------------------");
        System.out.println("VALOR EM DOLAR: U$" + valorDolar);
        System.out.println("VALOR EM LIBRAS: R$" + String.format("%.2f", valorMoeda));

    }
}
