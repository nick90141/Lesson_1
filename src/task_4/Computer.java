package task_4;

public class Computer {
    public String model;
    public int year;

    public Computer (String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String toString() {
        return model + " " + year;
    }
}
