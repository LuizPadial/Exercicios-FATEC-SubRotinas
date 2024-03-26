import java.util.Locale;
import java.util.Scanner;

public class Exercicio01subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println(" Digite dois números para calcular a média");
        double n1 = entrada.nextDouble();
        double n2 = entrada.nextDouble();

        entrada.close();

        double resultado = media(n1, n2);
        System.out.println("A media é: "+resultado);


    }
    public static double media(double n1,double n2){
        return (n1+n2)/2;
    }


}
