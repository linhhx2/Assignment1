package model;

public class Publisher {
    public Publisher() {

    }
    public Publisher(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    private String id;
    private String name;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
