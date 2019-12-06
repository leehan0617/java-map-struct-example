package entity;

import java.util.List;

/**
 * Created by heron.lee 06/12/2019
 */
public class Family {
    private int id;
    private String name;
    private List<Person> members;

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

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }
}
