public class Plane extends Vehicle {
    private int numbersOfEngines;
    private int maxAltitiude;


    public Plane(String color, String engine, double fuelConsumption, int numbersOfEngines, int maxAltitude) {
        super(color, engine, fuelConsumption);
        this.numbersOfEngines = numbersOfEngines;
        this.maxAltitiude = maxAltitude;

        System.out.println("Konstruktor klasy Plane");
    }

    public int getNumbersOfEngines() {
        return numbersOfEngines;
    }

    public int getMaxAltitude() {
        return maxAltitiude;
    }

    public void setNumberOfEngines(int numbersOfEngines) {
        this.numbersOfEngines = numbersOfEngines;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitiude = maxAltitude;
    }

    @Override
    public String toString() {
        return "Obiekt klasy Plane\n Maksymalna wyskość lotu: " + maxAltitiude
                + "\n Ilość silników: " + numbersOfEngines
                + "\n Kolor: " + getColor()
                + "\n Spalanie: " + getFuelConsumption()
                + "\n Silnik: " + getEngine();
    }


}