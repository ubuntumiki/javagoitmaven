package core.com.module_06;

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    class NameFormatter {
        public String getFormatted() {
            return "Name is " + firstName + ", last name is " + lastName;
        }
    }

    public void printFormattedName() {
        String formattedName = new NameFormatter().getFormatted();
        System.out.println(formattedName);
    }
}

class PersonTest {
    public static void main(String[] args) {
        new Person("John", "Doe").printFormattedName();
    }
}
