import java.util.ArrayList;

public class Human {

    // Variables
    private String name;

    // Constructor
    public Human(String name) {
        this.name = name;
    }

    // Getters
    public String getName() {
        return name;
    }

    // Loads a dishwasher
    public void loadDishwasher(Dishwasher dishwasher) {
        ArrayList<Dish> dishes = new ArrayList<>();
        for (DishType type : DishType.values()) {
            dishes.add(new Dish(type, false, "dishwasher"));
        }
        dishwasher.getDishes().addAll(dishes);
    }

    // Unloads a dishwasher
    public void unloadDishwasher(Dishwasher dishwasher) {
        for (Dish dish : dishwasher) {
            switch (dish.getType()) {
                case BIG_PLATE:
                case SMALL_PLATE:
                case BIG_BOWL:
                case SMALL_BOWL:
                    dish.setLocation("lower-left");
                    break;
                case BIG_CUP:
                case SMALL_CUP:
                case TRANSPARENT_CUP:
                    dish.setLocation("lower-right");
                    break;
                case SPOON:
                case FORK:
                    dish.setLocation("top-left");
                    break;
                case KNIFE:
                case SHARP_KNIFE:
                    dish.setLocation("top-right");
                    break;
                default:
                    dish.setLocation("counter");
                    break;
            }
        }
    }

    // Stringify
    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }

}
