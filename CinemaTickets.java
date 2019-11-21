import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String type = "";
        int seats = 0;
        int countStudent = 0;
        int countStandard = 0;
        int countKids = 0;

        while (!"Finish".equals(movie)) {
            seats = Integer.parseInt(scanner.nextLine());
            double initialSeats = seats;
            type = scanner.nextLine();
            while (!"End".equals(type)) {
                if ("student".equals(type)) {
                    countStudent++;
                }
                if ("standard".equals(type)) {
                    countStandard++;
                }
                if ("kid".equals(type)) {
                    countKids++;
                }
                seats--;
                if (seats == 0) {
                    break;
                }
                type = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, (initialSeats - seats) / initialSeats * 100);
            movie = scanner.nextLine();
        }
        double totalTickets = countStudent + countStandard + countKids;
        System.out.printf("Total tickets: %d%n", (int) totalTickets);
        System.out.printf("%.2f%% student tickets.%n", countStudent / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", countStandard / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", countKids / totalTickets * 100);
    }
}
