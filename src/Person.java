public class Person {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAdress;

    Person(){ }
    Person(String firstName, String lastName, String phoneNumber, String emailAdress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAdress = emailAdress;
    }

    public void output(){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("email Address: " + emailAdress);

    }
}
