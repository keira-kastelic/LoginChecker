import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s): Megan
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/
public class LoginChecker {
    public static void main(String[] args) {
        Scanner file = new Scanner(System.in); // creating a new scanner
        try { // creating the try/ catch loop
            System.out.println("Here are your user names to choose from..."); // prompting the user
            Scanner username = new Scanner(new File("usernames.txt")); // creating a new scanner to access the username.txt file
            String username1 = username.nextLine(); // accessing the first username
            System.out.println(username1); // printing out the first username
            String username2 = username.nextLine();
            System.out.println(username2);
            String username3 = username.nextLine();
            System.out.println(username3);
            String username4 = username.nextLine();
            System.out.println(username4);
            String username5 = username.nextLine();
            System.out.println(username5);

        } catch (FileNotFoundException e) {
            System.out.println(e); // printing out the catcher loop
        }
        System.out.println("Enter a username..."); // prompting the user
        String enteredUsername = file.nextLine(); // saving the users username
        System.out.println("Enter a password"); // prompting the username
        String enteredPassword = file.nextLine(); // saving the users password

        try { // creating another try/catch loop
            String readUsername = enteredUsername + ".txt"; // creating a string that accesses the username from the file
            Scanner file2 = new Scanner(new File(readUsername)); // creating a scanner to read the username from the file
            String correctPassword = file2.nextLine(); // storing the username
            boolean isCorrectPassword = enteredPassword.equals(correctPassword); // creating a boolean to checn if the username is correct
            System.out.print("Your password is correct: "); // prompting the user
            System.out.println(isCorrectPassword); // printing out the boolean

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}