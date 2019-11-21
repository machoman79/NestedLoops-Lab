import java.util.Scanner;

public class Coding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numStr = scanner.nextLine();
        int num = numStr.length() - 1;

        for (int i = num; i >= 0; i--) {

            int symbol = Integer.parseInt("" + numStr.charAt(i));
            if (symbol != 0) {
                for (int j = 1; j <= symbol; j++) {
                    System.out.print((char) (symbol + 33));
                }
                System.out.println();
            } else {
                System.out.println("ZERO");
            }
        }
    }
}