import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int escolha = entrada.nextInt();
        int resultado = num(escolha);
        System.out.println(resultado);
        entrada.close();
    }

    public static int num(int n1){
        if (n1 % 2== 0 ){
            return 1;
        }else {
            return 0;
        }
    }

}
