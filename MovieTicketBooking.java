import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] movies = {
            "1. Pushpa 2",
            "2. Kalki 2898 AD",
            "3. Salaar",
            "4. Hi Nanna"
        };

        double[] prices = {200, 180, 150, 160};

        while (true) {

            System.out.println("\n===== MOVIE TICKET BOOKING =====");

            for (String movie : movies) {
                System.out.println(movie);
            }

            System.out.println("5. Exit");

            System.out.print("Choose a movie: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Thank you! Visit again.");
                break;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            if (tickets <= 0) {
                System.out.println("Invalid number of tickets!");
                continue;
            }

            double total = prices[choice - 1] * tickets;

            System.out.println("\n===== BOOKING CONFIRMATION =====");
            System.out.println("Movie: " + movies[choice - 1].substring(3));
            System.out.println("Tickets: " + tickets);
            System.out.println("Ticket Price: Rs." + prices[choice - 1]);
            System.out.println("Total Amount: Rs." + total);
            System.out.println("Booking Status: Confirmed");
            System.out.println("================================");
        }

        sc.close();
    }
}
