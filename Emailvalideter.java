import java.util.Scanner;
import java.util.regex.*;

public class Emailvalideter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email");
        String email = sc.nextLine();

        String chackeing_ref = "[[^a-z]+[0-9]+@[a-z]]+@(.+)$"; //sign ^ means letter must be start from that + means it will chack again and again.
        boolean b = Pattern.matches(chackeing_ref, email);


        System.out.println(b);
        if (b) {
            System.out.println("Your Email Adress is valid:)"+email);
        } else {
            System.out.println("Your Email Adress is Invalid:("+email);
        }
    }
}