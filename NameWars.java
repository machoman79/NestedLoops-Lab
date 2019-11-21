import java.util.Scanner;

public class NameWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        String topName = "";

        while (!"STOP".equals(name)) {
            sum = 0;
            for (int i = 0; i < name.length(); i++) {
                sum += name.charAt(i);
            }
            if (sum > max) {
                max = sum;
                topName = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d!", topName, max);
    }
}
