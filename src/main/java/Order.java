import java.util.List;

class Order {
    private List<Ingredient> ingredients;

    public Order(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public int calculateWaitingTime() {
        int nonVegCount = 0;
        int vegCount = 0;
        int beverageCount = 0;

        for (Ingredient ingredient : ingredients) {
            int priority = ingredient.getPriority();
            if (priority == 1) {
                nonVegCount++;
            } else if (priority == 2) {
                vegCount++;
            } else if (priority == 3) {
                beverageCount++;
            }
        }

        int waitingTime = (nonVegCount > 1 ? 60 : nonVegCount * 30) +
                (vegCount > 1 ? 30 : vegCount * 15) +
                (beverageCount * 10);

        return waitingTime;
    }
}

