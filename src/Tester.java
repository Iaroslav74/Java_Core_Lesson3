public class Tester extends Worker {

    public Tester(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double getBonus() {
        return salary*2;
    }
}
