public class Gearbox {

    private String model;
    private int numOfGears;

    public Gearbox(String model, int numOfGears){
        this.model = model;
        this.numOfGears = numOfGears;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfGears() {
        return numOfGears;
    }

    public void setNumOfGears(int numOfGears) {
        this.numOfGears = numOfGears;
    }
}
