import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int current = 1;
        boolean flag = false;

        for (int rows = 1; rows <= num; rows++) {
            for (int columns = 1; columns <= rows; columns++) {
                System.out.print(current + " ");
                current++;
                if (current > num) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            System.out.println();
        }
    }
}
