import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();

        String message = velocidadeAtual > 60 ? "Foi multado" : "Nao foi multado";

        System.out.println(message);
    }
}