public class HybridEngine extends Engine {

    private int engineSize;
    private int kilowatts;

    public HybridEngine(String name, int horsepower, int engineSize, int kilowatts) {
        super(name, horsepower);
        this.engineSize = engineSize;
        this.kilowatts = kilowatts;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getKilowatts() {
        return kilowatts;
    }

    public void setKilowatts(int kilowatts) {
        this.kilowatts = kilowatts;
    }
}
