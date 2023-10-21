import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {
    private List<Ingredient> menu;

    public RestaurantManager() {
        this.menu = initializeMenu();
    }

    private List<Ingredient> initializeMenu() {
        List<Ingredient> menu = new ArrayList<>();
        menu.add(new Ingredient("Chicken Biriyani", "Non-Veg", 1));
        menu.add(new Ingredient("Mutton Biriyani", "Non-Veg", 1));
        menu.add(new Ingredient("Fish Curry", "Non-Veg", 1));
        menu.add(new Ingredient("Veg Biriyani", "Veg", 2));
        menu.add(new Ingredient("Curd Rice", "Veg", 2));
        menu.add(new Ingredient("Lemon Rice", "Veg", 2));
        menu.add(new Ingredient("Coffee", "Beverages", 3));
        menu.add(new Ingredient("Tea", "Beverages", 3));
        menu.add(new Ingredient("Hot Chocolate", "Beverages", 3));
        return menu;
    }

    public Ingredient findIngredient(String name) {
        for (Ingredient ingredient : menu) {
            if (ingredient.getName().equalsIgnoreCase(name)) {
                return ingredient;
            }
        }
        return null;
    }

    public List<Ingredient> getMenu() {
        return menu;
    }

    public int processOrders(List<Order> orders, CircularQueue nonVegQueue, CircularQueue vegQueue, CircularQueue beverageQueue) {
        int totalWaitingTime = 0;
        for (Order order : orders) {
            int waitingTime = order.calculateWaitingTime();
            totalWaitingTime += waitingTime;

            for (Ingredient ingredient : order.getIngredients()) {
                String category = ingredient.getCategory();
                if (category.equals("Non-Veg")) {
                    nonVegQueue.enqueue(order);
                } else if (category.equals("Veg")) {
                    vegQueue.enqueue(order);
                } else if (category.equals("Beverages")) {
                    beverageQueue.enqueue(order);
                }
            }
        }
        return totalWaitingTime;
    }
}
