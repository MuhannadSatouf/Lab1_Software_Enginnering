import static org.junit.Assert.*;

public class PersonTest {
    String name;
    int age;
    Person person = new Person(name, age);

    @org.junit.Test
    public void getName() {
        person.setName("Jone");
        assertEquals("Jone", person.getName());
    }

    @org.junit.Test
    public void setName() {
        person.setName("Jone");
        assertEquals("Jone", person.getName());
    }

    @org.junit.Test
    public void getAge() {
        person.setAge(20);
        assertEquals(20, person.getAge());
    }

    @org.junit.Test
    public void setAge() {
        person.setAge(20);
        assertEquals(20, person.getAge());
    }

    @org.junit.Test
    public void reverseName() {
        assertEquals("enoj", person.reverseName("jone"));
    }
}