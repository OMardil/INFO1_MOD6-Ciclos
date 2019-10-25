import java.util.*;

public class CheckDate{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String date = keyboard.nextLine();

        if (date.length() != 10){
            System.out.println("Wrong date!");
            System.exit(0);
        }

        // 10/10/2019
        String dayStr = date.substring(0, 2);
        String monthStr = date.substring(3,5);
        String yearStr = date.substring(6,10);
        
        int day = Integer.parseInt(dayStr);
        int month = Integer.parseInt(monthStr);
        int year = Integer.parseInt(yearStr);

        if (!(year >= 0 && year <= 9999)){
            System.out.println("Wrong year!");
            System.exit(0);            
        }

        if (!(month >= 1 && month <= 12)){
            System.out.println("Wrong month!");
            System.exit(0);            
        }
        
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (!(day >= 1 && day <= 31)){
                    System.out.println("Invalid day!");
                    System.exit(0);
                    break;
                }
            case 4: case 6: case 9: case 11:
                if (!(day >= 1 && day <= 30)){
                    System.out.println("Invalid day!");
                    System.exit(0);
                    break;                    
                }
            case 2:
                boolean isLeapYear = checkLeapYear(year);
                if (isLeapYear && !(day >= 1 && day <= 29)){
                    System.out.println("Invalid day!");
                    System.exit(0);
                    break;   
                } else if (!isLeapYear && !(day >= 1 && day <= 28)){
                    System.out.println("Invalid day!");
                    System.exit(0);
                    break;   
                }
        }

        System.out.println("Correct date!");

        keyboard.close();

    }

    public static boolean checkLeapYear(int year){
        if (year % 4 != 0){
            return false;
        }

        if (year % 100 == 0 && !(year % 400 == 0)){
            return false;
        }

        return true;

    }

}