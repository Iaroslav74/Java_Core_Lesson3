public class Box2<T extends Worker> {

    T[] members;

    public Box2(T[] members) {
        this.members = members;
    }

    public double showBonusOfAllWorkers() {
        double sum = 0;
        for (T member : members) {
            sum += member.getBonus();
            System.out.println(member.getBonus());
        }
        return sum;

    }

    public boolean isBiggerSalaryThen(Box2<T> second) {
        return this.showBonusOfAllWorkers() > second.showBonusOfAllWorkers();
    }
}
