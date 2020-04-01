import java.util.ArrayList;

public class Customer implements ITransact {

    private String name;
    private double money;
    private ArrayList<Vehicle> collectionOfVehicles;

    public Customer(String name, double money){
        this.name = name;
        this.money = money;
        this.collectionOfVehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Vehicle> getCollectionOfVehicles() {
        return collectionOfVehicles;
    }

    public void buy(Vehicle vehicle) {
        this.money -= vehicle.getPrice();
        collectionOfVehicles.add(vehicle);
    }

    public Vehicle sell(Vehicle vehicle) {
        this.money += vehicle.getPrice();
        int index = collectionOfVehicles.indexOf(vehicle);
        return collectionOfVehicles.remove(index);

    }
}
