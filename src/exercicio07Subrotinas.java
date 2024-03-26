import java.util.Scanner;

public class exercicio07Subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        int valor1 = entrada.nextInt();

        System.out.println("Digite o segundo valor:");
        int valor2 = entrada.nextInt();

        // Chama a função percentual e imprime o resultado diretamente
        percentual(valor1, valor2);

        entrada.close();
    }

    public static void percentual(int n1, int n2){
        int dif = ((n2 - n1) * 100) / (n1 < n2 ? n1 : n2);
        System.out.println("A diferença percentual é: " + dif + "%");
    }
}
