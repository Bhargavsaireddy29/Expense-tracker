import java.util.*;

public class Main {
    public static void main(String[] args) {
        ExpenseTracker tracker = new ExpenseTracker();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Expense Tracker Menu ---");
            System.out.println("1. Add Expense");
            System.out.println("2. View All Expenses");
            System.out.println("3. View Category-wise Total");
            System.out.println("4. Search Expenses by Date");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Date (yyyy-mm-dd): ");
                    String date = sc.nextLine();
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    System.out.print("Amount: ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Note: ");
                    String note = sc.nextLine();
                    tracker.addExpense(date, category, amount, note);
                    break;

                case 2:
                    tracker.viewAllExpenses();
                    break;

                case 3:
                    tracker.viewTotalByCategory();
                    break;

                case 4:
                    System.out.print("Enter date to search (yyyy-mm-dd): ");
                    String searchDate = sc.nextLine();
                    tracker.searchByDate(searchDate);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}