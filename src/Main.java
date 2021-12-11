public class Main {
    public static void main(String[] args) {

        Box<Integer, String> box = new Box<>(new Integer[3], "hello");
        box.objects[0] = 123;
        box.objects[1] = 1234;
        box.objects[2] = 12345;

        Integer i = box.objects[2];
        // System.out.println(i);

        Box<String, String> box2 = new Box<>(new String[3], "hello");
        box2.objects[0] = "123";
        box2.objects[1] = "1234";
        box2.objects[2] = "12345";

        // box.doSmth(14+5);
        // box2.doSmth("4653"+5);

        // Programmers

        Programmer programmer1 = new Programmer("sdf", 145346);
        Programmer programmer2 = new Programmer("gbnm", 5687);

        Programmer[] programmers = new Programmer[] {programmer1, programmer2};

        Box2<Programmer> box21 = new Box2<>(programmers);
        System.out.println(box21.showBonusOfAllWorkers());

        // Testers

        Tester tester1 = new Tester("bfh", 2568);
        Tester tester2 = new Tester("scvgh", 458);

        Tester[] testers = new Tester[] {tester1, tester2};

        Box2<Tester> box22 = new Box2<>(testers);
        System.out.println(box22.showBonusOfAllWorkers());

        System.out.println(box22.isBiggerSalaryThen(box22));
    }
}
