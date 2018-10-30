package guokun.com.cn.ondcode.entity;

public class Fruit {
    private String name;
    private  int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fruit(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
