import javax.swing.*;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if ((age < 0) || (age > 100)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if ((getAge() > 12) && (getAge() < 20)) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if ((this.firstName.isEmpty()) && (this.lastName.isEmpty())) {
            return "";
        } else if (lastName.isEmpty()) {
            return getFirstName();
        } else if (firstName.isEmpty()) {
            return getLastName();
        } else {
            return (getFirstName() + " " + getLastName());
        }
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName(""); // Set to empty string
        person.setLastName(""); // Set to empty string
        person.setAge(10);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("Full Name = " + person.getFullName());
        System.out.println("Teen = " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("Full name = " + person.getFullName());
    }
}
