import java.util.Locale;
import java.util.Scanner;

public class ConversorEuroLibras {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorEuro, valorLibras = 0.85, valorMoeda;

        System.out.print("Informe o valor em EURO para a conversão em LIBRAS: ");
        valorEuro = objIn.nextDouble();

        valorMoeda = valorEuro * valorLibras;

        System.out.println();
        System.out.println("Cotação atual da LIBRAS: " + valorLibras);
        System.out.println("-----------------------------------");
        System.out.println("VALOR EM EURO: U$" + valorEuro);
        System.out.println("VALOR EM LIBRAS: R$" + String.format("%.2f", valorMoeda));

    }
}
