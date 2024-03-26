import java.util.Locale;
import java.util.Scanner;

public class Exercicios03Subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Escolha uma opção para calcular");
        System.out.println("1 para Somar");
        System.out.println("2 para Subtrair");
        System.out.println("3 para Multiplar");
        System.out.println("4 para Dividir");

        int escolha = entrada.nextInt();

        switch (escolha){
            case 1:
                int n1 = entrada.nextInt();
                int n2 = entrada.nextInt();
                int resultado = soma(n1, n2);
                System.out.println("A soma é: "+resultado);
            break;
            case 2:
                n1 = entrada.nextInt();
                n2 = entrada.nextInt();
                resultado = subtr(n1, n2);
                System.out.println("A divisão é: "+resultado);
            break;
            case 3:
                n1 = entrada.nextInt();
                n2 = entrada.nextInt();
                resultado = mult(n1, n2);
                System.out.println("A multiplicação é: "+resultado);
            break;
            case 4:
                n1 = entrada.nextInt();
                n2 = entrada.nextInt();
                resultado = div(n1, n2);
                System.out.println("A divisão é: "+resultado);
            break;
        }
        entrada.close();
    }

    public static int soma(int n1, int n2){
        return n1+n2;
    }

    public static int subtr(int n1, int n2){
        return n1-n2;
    }

    public static int mult(int n1, int n2){
        return n1* n2;
    }
    public static int div(int n1, int n2){
        return n1/n2;
    }
}
