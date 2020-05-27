public class TestZadanie3 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("default color", "default engine", 0);
        Vehicle vehicle2 = new Car("black", "1.8 ltr", 13.3, 2, true, "CLK", "Mercedes");
        Vehicle vehicle3 = new Plane("grey", "jet engine", 1000, 1, 8300);
        Vehicle vehicle4 = new Boat("yellow", "Honda straight four", 30.4, 2, 3.8);

        System.out.println(vehicle1.toString()); // wykonana metoda toString z klasy Vehicle
        System.out.println(vehicle2.toString()); // wykonana metoda toString z klasy Car
        System.out.println(vehicle3.toString()); // wykonana metoda toString z klasy Plane
        System.out.println(vehicle4.toString()); // wykonana metoda toString z klasy Boat



    }
}
