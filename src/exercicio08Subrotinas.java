import java.util.Scanner;

public class exercicio08Subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolha o tipo de media A normal ou P ponderada");
        char escolha = entrada.next().charAt(0);

        if (escolha == 'a'){
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();
            double calculo = media(n1, n2, n3);
            System.out.printf("Media: %.2f.%n",calculo);
        }else{
            int n1 = entrada.nextInt();
            int n2 = entrada.nextInt();
            int n3 = entrada.nextInt();
            double calculo = ponderada(n1, n2, n3);
            System.out.printf("Media: %.2f.%n",calculo);

        }
     entrada.close();
    }

    public static double media (int n1, int n2, int n3){
        return (double) (n1 + n2 + n3) /3;
    }

    public static double ponderada (int n1, int n2, int n3){
        return (double) ((n1 * 5) + (n2 * 3) + (n3 * 2)) /10;
    }
}
