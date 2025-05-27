import java.util.*;

public class ExpenseTracker {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(String date, String category, double amount, String note) {
        expenses.add(new Expense(date, category, amount, note));
    }

    public void viewAllExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }
        for (Expense e : expenses) {
            System.out.println(e);
        }
    }

    public void viewTotalByCategory() {
        Map<String, Double> categoryTotals = new HashMap<>();
        for (Expense e : expenses) {
            categoryTotals.put(e.getCategory(), categoryTotals.getOrDefault(e.getCategory(), 0.0) + e.getAmount());
        }
        System.out.println("Category-wise Total:");
        for (String cat : categoryTotals.keySet()) {
            System.out.println(cat + ": " + categoryTotals.get(cat));
        }
    }

    public void searchByDate(String targetDate) {
        boolean found = false;
        for (Expense e : expenses) {
            if (e.getDate().equals(targetDate)) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) System.out.println("No expenses found for that date.");
    }
}