import java.util.Locale;
import java.util.Scanner;

public class Exercicio05Subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite dois valores inteiros");
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();

        int resultado = somaGeral(n1, n2);
        System.out.println(resultado);

        entrada.close();
    }

    public static int somaGeral(int n1, int n2){
        int soma = 0;
        for (int i = n1;i <= n2; i++){
            soma += i;
        }
        return soma;
    }

}

