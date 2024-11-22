public class addressbookExtended {
    public static void main(String[] args) {


        Person p1 = new Person("Eda", "eda@gmail.com", "123-456-7890", 27);
        p1.print();
        Person p2 = new Person("Hannah", "hannah@gmail.com", "404-899-9955", 27);
        p2.print();
        Person p3 = new Person("Pesho", "peshogotiniq@gmail.com", "782-834-7923", 73);
        p3.print();
        Person p4 = new Person("Tsako", "1914tsako@gmail.com", "381-756-5534", 68);
        p4.print();


        System.out.println("Contact: " + p2.getPhoneNumber());
        System.out.println("Hey " + p3.getName());
        System.out.println("Contact: " + p1.getEmail());
        System.out.println("The user is " + p4.getAge() + " old");


        p3.update("newmail@abv.bg");


    }
}


// Define the Person class here
class Person {
    // Instance variables
    private String name;
    private String email;
    private String phoneNumber;
    private int age;




    // Constructor: Initialize Person data
    public Person(String name, String email, String phoneNumber, int age) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;


    }


    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Age:" + age);


    }


    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getAge() {
        return age;
    }


    public void update(String email2){
        email=email2;
        System.out.println("New email is:" + email);
    }


}

