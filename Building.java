import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floors = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = floors; i >= 1; i--) {
            for (int j = 0; j < rooms; j++) {
                if (counter == 0) {
                    for (int k = 0; k < rooms; k++) {
                        System.out.printf("L%d%d ", i, k);
                    }
                    break;
                }
                if (i % 2 != 0) {
                    System.out.printf("A%d%d ", i, j);
                } else {
                    System.out.printf("O%d%d ", i, j);
                }
            }
            System.out.println();
            counter++;
        }
    }
}
