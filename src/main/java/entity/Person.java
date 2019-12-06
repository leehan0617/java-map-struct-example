package entity;

/**
 * Created by heron.lee 06/12/2019
 */
public class Person {
    private int id;
    private String name;
    private int age;

    public Person () {
    }
    public Person (int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
