public abstract class Worker {
    String name;
    double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public abstract double getBonus();

}
