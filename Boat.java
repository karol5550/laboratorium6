public class Boat extends Vehicle {
    private int numbersOfBeds;
    private double length;


    public Boat(String color, String engine, double fuelConsumption, int numbersOfBeds, double length) {
        super(color, engine, fuelConsumption);
        this.numbersOfBeds = numbersOfBeds;
        this.length = length;

        System.out.println("Konstruktor klasy Boat");
    }

    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public double getLength() {
        return length;
    }

    public void setNumbersOfBeds(int numbersOfBeds) {
        this.numbersOfBeds = numbersOfBeds;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Obiekt klasy Boat\n Długość łodzi: " + length
                + "\n Ilość łóżek pod pokładem: " + numbersOfBeds
                + "\n Kolor: " + getColor()
                + "\n Spalanie: " + getFuelConsumption()
                + "\n Silnik: " + getEngine();
    }


}