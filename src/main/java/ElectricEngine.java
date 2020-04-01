public class ElectricEngine extends Engine {

    private int kilowatts;

    public ElectricEngine(String name, int horsepower, int kilowatts) {
        super(name, horsepower);
        this.kilowatts = kilowatts;
    }

    public int getKilowatts() {
        return kilowatts;
    }

    public void setKilowatts(int kilowatts) {
        this.kilowatts = kilowatts;
    }
}
