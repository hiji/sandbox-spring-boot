package hello;

/**
 * Created by hijiri on 2017/05/11.
 */
public class Account {

    String name;

    Integer age;

    public Account(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
