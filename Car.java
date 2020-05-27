public class Car extends Vehicle implements Comparable<Car> {
    private int numbersOfDoors;
    private boolean turbo;
    private String model;
    private String brand;

    public Car(String color, String engine, double fuelConsumption, int numbersOfDoors, boolean turbo, String model, String brand) {
        super(color, engine, fuelConsumption);
        this.numbersOfDoors = numbersOfDoors;
        this.turbo = turbo;
        this.model = model;
        this.brand = brand;

        System.out.println("Konstruktor klasy Car");
    }

    public int getNumberOfDoors() {
        return numbersOfDoors;
    }

    public boolean getTurbo() {
        return turbo;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumberOfDoors(int numbersOfDoors) {
        this.numbersOfDoors = numbersOfDoors;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Obiekt klasy Car\n Model: " + model
                + "\n Marka: " + brand
                + "\n Kolor: " + getColor()
                + "\n Liczba drzwi: " + numbersOfDoors
                + "\n Spalanie: " + getFuelConsumption()
                + "\n Silnik: " + getEngine()
                + "\n Turbo: " + turbo;
    }

    @Override
    public int compareTo(Car o) {
        return this.model.compareTo(o.model);
    }
}
