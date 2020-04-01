import java.util.ArrayList;

public class Dealership implements ITransact{

    private String name;
    private double money;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, double money){
        this.name = name;
        this.money = money;
        this.vehicles = new ArrayList<Vehicle>();
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

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void buy(Vehicle vehicle) {
        this.money -= vehicle.getPrice();
        vehicles.add(vehicle);
    }

    public Vehicle sell(Vehicle vehicle) {
        this.money += vehicle.getPrice();
        int index = vehicles.indexOf(vehicle);
        return vehicles.remove(index);
    }

    public void sellToCustomer(Vehicle vehicle, Customer customer){
        customer.buy(this.sell(vehicle));
    }

}
