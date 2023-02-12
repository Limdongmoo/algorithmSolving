public class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Worker {
    People people;
    String workPlace;

    public String getWorkPlace() {
        return workPlace;
    }
}
