import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        CircularQueue nonVegQueue = new CircularQueue(5);
        CircularQueue vegQueue = new CircularQueue(5);
        CircularQueue beverageQueue = new CircularQueue(5);

        List<Order> orders = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        RestaurantManager manager = new RestaurantManager();

        System.out.println("Welcome to Jan's Restaurant");
        System.out.println("This is your menu for the day:");

        for (Ingredient ingredient : manager.getMenu()) {
            System.out.println(ingredient.getName());
        }

        String response;
        do {
            List<Ingredient> userIngredients = new ArrayList<>();
            do {
                System.out.print("Enter the ingredient you want to order: ");
                String ingredientName = scanner.nextLine();
                Ingredient selectedIngredient = manager.findIngredient(ingredientName);
                if (selectedIngredient != null) {
                    userIngredients.add(selectedIngredient);
                } else {
                    System.out.println("Invalid ingredient. Please choose from the menu.");
                }
                System.out.print("Do you need to order anything else? (Y/N): ");
                response = scanner.nextLine();
            } while (response.equalsIgnoreCase("Y"));

            Order order = new Order(userIngredients);
            orders.add(order);

            System.out.print("Do you want to place another order? (Y/N): ");
            response = scanner.nextLine();
        } while (response.equalsIgnoreCase("Y"));

        int totalWaitingTime = manager.processOrders(orders, nonVegQueue, vegQueue, beverageQueue);
        System.out.println("Total waiting time for your orders: " + totalWaitingTime + " minutes");
    }
}
