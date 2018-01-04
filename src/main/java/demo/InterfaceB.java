package demo;

/**
 * Created on 2018-01-04
 *
 * @author Jerry Shen
 */
public interface InterfaceB {

    default void get() {
        System.out.println(5);
    }
}
