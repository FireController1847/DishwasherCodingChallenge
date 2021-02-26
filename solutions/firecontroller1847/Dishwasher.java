import java.util.*;
import java.util.function.Consumer;

public class Dishwasher implements Iterable<Dish> {

    private ArrayList<Dish> dishes = new ArrayList<>();

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public void load(Human human) {
        human.loadDishwasher(this);
    }

    public void run() {
        for (Dish dish : dishes) {
            dish.setClean(true);
        }
    }

    public void unload(Human human) {
        human.unloadDishwasher(this);
    }

    @Override
    public Iterator<Dish> iterator() {
        ArrayList<Dish> copy = (ArrayList<Dish>) dishes.clone();
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return copy.size() > 0;
            }

            @Override
            public Dish next() {
                return copy.remove(0);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super Dish> action) {
        for (Dish dish : dishes) {
            action.accept(dish);
        }
    }

    @Override
    public Spliterator<Dish> spliterator() {
        return null;
    }

}
