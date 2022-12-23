import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();

        System.out.printf("O cliente obteve %d doces", doce*2);
    }
}