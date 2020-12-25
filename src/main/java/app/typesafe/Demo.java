package app.typesafe;

import java.util.List;
import java.util.Map;

public class Demo {
    private String name;
    private int age;
    private boolean men;
    // list类型
    private List<String> address;
    // map类型
    private Map<String, Object> family;

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

    public boolean isMen() {
        return men;
    }

    public void setMen(boolean men) {
        this.men = men;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, Object> getFamily() {
        return family;
    }

    public void setFamily(Map<String, Object> family) {
        this.family = family;
    }
}
