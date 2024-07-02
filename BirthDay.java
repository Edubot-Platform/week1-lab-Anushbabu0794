import java.util.Scanner;

public class BirthDay {
    private String name;
    private int birthMonth;
    private int birthDay;
    private int birthYear;

    public BirthDay(String name, int birthMonth, int birthDay, int birthYear) {
        this.name = name;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
    }

    public void printBirthday(boolean isFriend) {
        String prefix = isFriend ? "my friend " + name + "'s" : "my";
        System.out.println("In the USA " + prefix + " birthday is: " + birthMonth + "/" + birthDay + "/" + birthYear);
        System.out.println("In England " + prefix + " birthday is: " + birthDay + "/" + birthMonth + "/" + birthYear);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Input for your birthday
            String myInput = scanner.nextLine();
            String[] myData = myInput.split(",");
            if (myData.length != 4) throw new IllegalArgumentException("Invalid Input");
            String myName = myData[0].trim();
            int myMonth = Integer.parseInt(myData[1].trim());
            int myDay = Integer.parseInt(myData[2].trim());
            int myYear = Integer.parseInt(myData[3].trim());
            if (myMonth < 1 || myMonth > 12 || myDay < 1 || myDay > 31 || myYear < 1950 || myYear > 2024) throw new IllegalArgumentException("Invalid Input");

            // Input for friend's birthday
            String friendInput = scanner.nextLine();
            String[] friendData = friendInput.split(",");
            if (friendData.length != 4) throw new IllegalArgumentException("Invalid Input");
            String friendName = friendData[0].trim();
            int friendMonth = Integer.parseInt(friendData[1].trim());
            int friendDay = Integer.parseInt(friendData[2].trim());
            int friendYear = Integer.parseInt(friendData[3].trim());
            if (friendMonth < 1 || friendMonth > 12 || friendDay < 1 || friendDay > 31 || friendYear < 1950 || friendYear > 2024) throw new IllegalArgumentException("Invalid Input");

            // Create BirthDay objects
            BirthDay myBirthday = new BirthDay(myName, myMonth, myDay, myYear);
            BirthDay friendBirthday = new BirthDay(friendName, friendMonth, friendDay, friendYear);

            // Print birthdays
            myBirthday.printBirthday(false);
            friendBirthday.printBirthday(true);
        } catch (Exception e) {
            System.out.println("Invalid Input");
        } finally {
            scanner.close();
        }
    }
}