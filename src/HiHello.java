import java.util.Scanner;

public class HiHello {
    public static void main(String args[]) {
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = keyboard.next();
        System.out.println(heyThere(name));
    }

 public static String heyThere(String name)
 { return "Hello" +name+ "!";
 }
}