import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue");
        Scanner scanner = new Scanner(System.in);
        boolean shouldQuit = false;
        do {
            System.out.println("Entrer une commande:");
            String nxt = scanner.nextLine();
            if (nxt.equals("quit")) {
                shouldQuit = true;
            } else if ("fibo".equals(nxt)) {
                System.out.println("Entrer un nombre:");
                int n = scanner.nextInt();
                scanner.nextLine();
                System.out.println(fibo(n));
            } else {
                System.out.println("Unknown command");
            }
        }while (!shouldQuit);

    }

    private static int fibo(int n) {
        return n == 0 || n == 1 ? n : fibo(n - 1) + fibo(n - 2);
    }

}
