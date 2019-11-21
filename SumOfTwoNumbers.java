import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int flag = 0;

        for (int first = firstNum; first <= endNum; first++) {
            int second = firstNum;
            while (second <= endNum) {
                counter++;
                if (first + second == magicNum) {
                    flag++;
                    break;
                }
                second++;
            }
            if (flag != 0) {
                System.out.printf("Combination N:%d (%d + %d = %d)", counter, first, second, magicNum);
                break;
            }
        }
        if (flag == 0) {
            System.out.printf("%d combinations - neither equals %d", counter, magicNum);
        }
    }
}
