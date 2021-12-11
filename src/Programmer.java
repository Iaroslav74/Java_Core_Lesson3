public class Programmer extends Worker {

    public Programmer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return salary*1.5;
    }
}
