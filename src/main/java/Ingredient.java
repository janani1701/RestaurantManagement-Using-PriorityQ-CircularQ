class Ingredient {
    private String name;
    private String category;
    private int priority;

    public Ingredient(String name, String category, int priority) {
        this.name = name;
        this.category = category;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public int getPriority() {
        return priority;
    }
}

