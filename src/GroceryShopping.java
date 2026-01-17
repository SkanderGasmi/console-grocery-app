import java.util.Scanner;

public class GroceryShopApp {

    // Custom exception
    static class ItemNotFoundException extends Exception {
        public ItemNotFoundException(String item) {
            super("Item not found in inventory: " + item);
        }
    }

    public static void main(String[] args) {

        String[] items = {
                "Rice", "Pasta", "Milk", "Bread", "Eggs",
                "Cheese", "Apple", "Banana", "Chicken", "Oil"
        };

        float[] prices = {
                3.50f, 2.20f, 1.40f, 1.10f, 2.80f,
                4.50f, 0.60f, 0.50f, 7.90f, 5.30f
        };

        int[] stock = {20, 15, 25, 30, 18, 10, 50, 50, 12, 8};

        Scanner scanner = new Scanner(System.in);

        // ---- Test additional features ----
        searchItem(items, "Milk");
        System.out.println("Average price: " + calculateAveragePrice(prices));
        filterItemsBelowPrice(items, prices, 2.00f);
        // ----------------------------------

        while (true) {
            float totalBill = 0.0f;

            System.out.println("\nEnter item name (Finish to checkout, Exit to quit):");

            while (true) {
                String input = scanner.nextLine().trim();

                if (input.equalsIgnoreCase("Exit")) {
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                }

                if (input.equalsIgnoreCase("Finish")) {
                    break;
                }

                try {
                    int index = findItemIndex(items, input);

                    System.out.print("Enter quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());

                    if (quantity <= 0) {
                        throw new IllegalArgumentException("Quantity must be positive.");
                    }

                    if (stock[index] < quantity) {
                        System.out.println("Insufficient stock. Available: " + stock[index]);
                        continue;
                    }

                    float itemTotal = prices[index] * quantity;
                    totalBill += itemTotal;
                    stock[index] -= quantity;

                    System.out.println(items[index] + " added. Item total: $" + itemTotal);

                } catch (ItemNotFoundException | IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            // ---- Discount logic ----
            System.out.println("\nOriginal total: $" + totalBill);

            if (totalBill > 100) {
                float discountedTotal = totalBill * 0.9f;
                System.out.println("10% discount applied.");
                System.out.println("Discounted total: $" + discountedTotal);
            }

            System.out.println("New purchase or type Exit to quit.");
        }
    }

    // -------- Required Methods --------

    // Item search
    private static void searchItem(String[] items, String name) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(name)) {
                System.out.println("Item found at index: " + i);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Average price
    private static float calculateAveragePrice(float[] prices) {
        float sum = 0;
        for (float p : prices) {
            sum += p;
        }
        return sum / prices.length;
    }

    // Filter items
    private static void filterItemsBelowPrice(String[] items, float[] prices, float threshold) {
        System.out.println("\nItems below $" + threshold + ":");
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < threshold) {
                System.out.println(items[i] + " - $" + prices[i]);
            }
        }
    }

    // Find item index
    private static int findItemIndex(String[] items, String name) throws ItemNotFoundException {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase(name)) {
                return i;
            }
        }
        throw new ItemNotFoundException(name);
    }
}
