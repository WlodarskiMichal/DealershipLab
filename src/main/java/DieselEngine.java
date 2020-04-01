public class DieselEngine extends Engine {

    private double engineSize;

    public DieselEngine(String model, int horsepower, double engineSize) {
        super(model, horsepower);
        this.engineSize = engineSize;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
