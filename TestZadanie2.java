import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestZadanie2 {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Car("blue", "2.0", 11, 4, true, "206", "Peugeot"));
        list.add(new Car("red", "1.6", 12.3, 3, false, "C5", "Citroen"));
        list.add(new Car("grey", "1.8", 15.7, 4, true, "A4", "Audi"));
        list.add(new Car("yellow", "1.0", 7.8, 5, true, "Fiesta", "Ford"));
        list.add(new Car("orange", "6.4", 25.3, 2, true, "Hurracan", "Lamborghini"));

        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
