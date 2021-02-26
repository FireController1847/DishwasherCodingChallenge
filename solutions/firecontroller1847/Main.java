public class Main {

    public static void main(String[] args) {
        Dishwasher dishwasher = new Dishwasher();
        Human human = new Human("Fire");
        dishwasher.load(human);
        dishwasher.run();
        dishwasher.unload(human);

        for (Dish dish : dishwasher) {
            System.out.println(dish);
        }
    }

}
