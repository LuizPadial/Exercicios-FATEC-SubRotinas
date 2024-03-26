import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Subrotinas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int segundos = entrada.nextInt();
        int[] tempo = converterSegundos(segundos);

        System.out.println("Horas: " + tempo[0]);
        System.out.println("Minutos: " + tempo[1]);
        System.out.println("Segundos: " + tempo[2]);

        entrada.close();
    }
    public static int[] converterSegundos(int totalSegundos) {
        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        int[] tempo = {horas, minutos, segundos};
        return tempo;
    }
}
