public class Box<T, S> implements Example<T> {

    T[] objects;

    public Box(T[] array, S second) {
        System.out.println(second);
        objects = array;

    }
    @Override
    public void doSmth(T param) {
        System.out.println(param);

    }

}
