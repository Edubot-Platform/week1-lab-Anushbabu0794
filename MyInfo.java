import java.util.Scanner;

public class MyInfo {
    private int age;
    private String firstName;
    private String lastName;
    private String city;

    public MyInfo(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public void printInfo() {
        System.out.println("My Name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old and was born in " + city + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input
            String input = scanner.nextLine();
            String[] data = input.split(",");
            if (data.length != 4) throw new IllegalArgumentException("Invalid Input");

            String firstName = data[0].trim();
            String lastName = data[1].trim();
            int age = Integer.parseInt(data[2].trim());
            String city = data[3].trim();

            // Validate input
            if (!firstName.matches("[a-zA-Z]+") || !lastName.matches("[a-zA-Z]+") || age <= 1 || age >= 100 || !city.matches("[a-zA-Z ]+")) {
                throw new IllegalArgumentException("Invalid Input");
            }

            // Create MyInfo object
            MyInfo myInfo = new MyInfo(firstName, lastName, age, city);

            // Print info
            myInfo.printInfo();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}