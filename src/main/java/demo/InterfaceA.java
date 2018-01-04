package demo;

/**
 * Created on 2018-01-04
 *
 * @author Jerry Shen
 */
public interface InterfaceA {

    default void get() {
        System.out.println(2);
    }
}
