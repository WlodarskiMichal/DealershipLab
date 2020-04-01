public class Vehicle {
    private String make;
    private String colour;
    private double price;
    private Engine engine;
    private Gearbox gearbox;
    private Tyres tyres;
    private double damage;

    public Vehicle(String make, String colour, double price, Engine engine, Gearbox gearbox, Tyres tyres){
        this.make = make;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.gearbox = gearbox;
        this.tyres = tyres;
        this.damage = 0;
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Gearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public double damage(double damage){
        double priceForRepairing = this.price * damage/10;
        this.price -= priceForRepairing;
        return priceForRepairing;
    }

    public void repair(double damage){
        this.price += damage(damage);
    }

}

