import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();

        while (!"End".equals(destination)) {
            double budget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < budget) {
                double save = Double.parseDouble(scanner.nextLine());
                sum += save;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }
    }
}
