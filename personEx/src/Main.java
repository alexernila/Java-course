public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("becky");
        person.setSecondName("lisa");
        person.setAge(17);
        System.out.println("full name is " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
    }
}
