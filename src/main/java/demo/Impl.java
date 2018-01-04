package demo;

/**
 * Created on 2018-01-04
 *
 * @author Jerry Shen
 */
public class Impl implements InterfaceA, InterfaceB {

    public static void main(String[] args) {
        InterfaceA interfaceB = new Impl();
        interfaceB.get();
    }

    @Override
    public void get() {

    }
}
