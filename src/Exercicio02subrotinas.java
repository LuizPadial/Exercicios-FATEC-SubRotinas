import java.util.Locale;
import java.util.Scanner;

public class Exercicio02subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Escolha quantos números para calcular a média");
        int escolha = entrada.nextInt();

        if (escolha == 3) {
            System.out.println("Digite as notas");
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();

            double resultado = media3(n1, n2, n3);
            System.out.printf("A media é:%.2f " , resultado);
        } else if (escolha == 4) {
            System.out.printf("Digite as notas");
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();
            int n4 = entrada.nextInt();

            double resultado = media4(n1, n2, n3, n4);
            System.out.printf("A media é:%.2f " , resultado);
        } else if (escolha == 5) {
            System.out.println("Digite as notas");
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();
            int n4 = entrada.nextInt();
            int n5 = entrada.nextInt();
            double resultado = media5(n1, n2, n3,n4,n5);
            System.out.printf("A media é:%.2f " , resultado);

        } else {
            System.out.println("Escolha um numero que seja 3, 4 ou 5");

        }
        entrada.close();
    }
    public static double media3(double n1,double n2,double n3){
        return (n1+n2+n3)/3;
    }
    public static double media4(double n1,double n2,double n3, double n4){
        return (n1+n2+n3+n4)/4;
    }
    public static double media5(double n1,double n2, double n3, double n4, double n5){
        return (n1+n2+n3+n4+n5)/5;
    }

}
