public class Dish {

    // Variables
    private DishType type;
    private boolean clean;
    private String location;

    // Constructor
    public Dish(DishType type, boolean clean, String location) {
        this.type = type;
        this.clean = clean;
        this.location = location;
    }
    public Dish(DishType type) {
        this(type, true, "store");
    }

    // Getters
    public DishType getType() {
        return type;
    }
    public boolean isClean() {
        return clean;
    }
    public String getLocation() {
        return location;
    }

    // Setters
    public void setType(DishType type) {
        this.type = type;
    }
    public void setClean(boolean clean) {
        this.clean = clean;
    }
    public void setLocation(String location) {
        this.location = location;
    }

    // Stringify
    @Override
    public String toString() {
        return "Dish{" +
                "type=" + type +
                ", clean=" + clean +
                ", location='" + location + '\'' +
                '}';
    }

}
