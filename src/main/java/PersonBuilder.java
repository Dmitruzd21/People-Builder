public class PersonBuilder {

    protected String name;

    protected String surname;

    protected int age;

    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String city) {
        this.address = city;
        return this;
    }

    public Person build() {
        if (age < 0) {
            throw new IllegalArgumentException("Age should be more than 0!");
        } else if (name == null || surname == null) {
            throw new IllegalStateException("Name/surname should be set for full object initialisation!");
        }
        return new Person(name, surname, age, address);
    }
}
