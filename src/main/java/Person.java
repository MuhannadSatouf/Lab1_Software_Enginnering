public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        setAge(age);
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
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String reverseName(String name) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        return String.valueOf(stringBuilder.reverse());

    }
}
