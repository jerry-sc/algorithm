package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2017-12-05
 *
 * @author Jerry Shen
 */
public class ArrayListLearn {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Jerry"));
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
