import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        boolean invalidInput = true;
        int i;
        Scanner keyboard = new Scanner(System.in);      
        do {
            System.out.print("Type a number between 1 and 10: ");
            i = keyboard.nextInt();
            if (i >= 1 && i <= 10){
                invalidInput = false;
            } else {
                System.out.println("Error. Try again!");
            }
        } while(invalidInput == true);

        System.out.println("Success: " + i + " is a valid number");

        keyboard.close();
    }
}
