public class Person {

    protected final String name;

    protected final String surname;

    protected int age;

    protected String address;

    private boolean isAgeKnown = age > 0;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder();
        return personBuilder.setSurname(surname).setAddress(address).setAge(0);
    }

    public void happyBirthday() {
        if (isAgeKnown) {
            age++;
        }
    }

    public boolean hasAge() {
        return isAgeKnown;
    }

    public boolean hasAddress() {
        if (address == null) {
            return false;
        } else {
            return true;
        }
    }

    public void setAddress(String city) {
        this.address = city;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return address;
    }

    public String toString() {
        return name + " " + surname + " (возраст: " + age + ", адрес: " + address + ")";
    }
}
