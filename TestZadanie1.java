public class TestZadanie1 {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("black", "petrol engine", 10);
        Car car = new Car("white", "3.5 ltr V6", 20, 2, true, "GS 500", "Lexus");
        Plane plane = new Plane("grey", "Rolce Royce jet engine", 1000, 2, 7500);
        Boat boat = new Boat("green", "Yamaha straight 6", 50, 2, 3.25);

        System.out.println(vehicle);
        System.out.println();
        System.out.println(car);
        System.out.println();
        System.out.println(plane);
        System.out.println();
        System.out.println(boat);

        // W przypadku tworzenia klasy potomnej, w pierwszej kolejności zostaje wywołany konstruktor klasy bazowej a następnie klasy potomnej
    }

}
