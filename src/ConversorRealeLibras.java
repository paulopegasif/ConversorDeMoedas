import java.util.Locale;
import java.util.Scanner;

public class ConversorRealeLibras {
    public static void main(String[] args){
        Scanner objIn = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double valorReal, valorLibras = 7.51;

        System.out.print("Informe o valor em REAL para a conversão em LIBRAS: ");
        valorReal = objIn.nextDouble();

        valorLibras = valorReal / 7.51;

        System.out.println();
        System.out.println("VALOR EM REAIS: R$" + valorReal);
        System.out.println("VALOR EM DOLAR: U$" + String.format("%.2f", valorLibras));

    }
}
