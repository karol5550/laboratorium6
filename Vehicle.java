public class Vehicle {
    private String color;
    private String engine;
    private double fuelConsumption;

    public Vehicle(String color, String engine, double fuelConsumption) {
        this.color = color;
        this.engine = engine;
        this.fuelConsumption = fuelConsumption;
        System.out.println("Konstruktor klasy Vehicle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return "Obiekt klasy Vehicle\n Spalanie: " + fuelConsumption
                + "\n Kolor: " + color
                + "\n Silnik: " + engine;
    }
}
