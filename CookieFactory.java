import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int portions = Integer.parseInt(scanner.nextLine());
        String product = "";
        int counter = 0;

        for (int i = 1; i <= portions; i++) {
            product = scanner.nextLine();
            while (!"Bake!".equals(product)) {

                if ("flour".equals(product)) {
                    counter++;
                }
                if ("eggs".equals(product)) {
                    counter++;
                }
                if ("sugar".equals(product)) {
                    counter++;
                }
                product = scanner.nextLine();
            }
            if (counter >= 3) {
                System.out.printf("Baking batch number %d...%n", i);
                counter = 0;
            } else {
                System.out.println("The batter should contain flour, eggs and sugar!");
                i--;
            }
        }
    }
}
