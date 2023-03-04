package model;

public class Employee {

    private long id;
    private String name;
    private String lastname;
    private String gender;
    private int age;

    private City city;

    public Employee(String name, String lastname, String gender, int age) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String name, String lastname, String gender, int age, City city) {
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public Employee(long id, String name, String lastname, String gender, int age, City city) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.age = age;
        this.city = city;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", city=" + city +
                '}';
    }
}
