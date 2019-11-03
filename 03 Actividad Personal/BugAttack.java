import java.util.Scanner;

public class BugAttack {

    public static final double ONE_BUG_VOLUME = 0.002; // m3
    public static final double GROWTH_RATE = 0.95; // 95% each week

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter volume of school: ");
        double schoolVolume = keyboard.nextDouble();
        double bugVolume = 2;

        int week = 0;

        do{
            week++;
            bugVolume = bugVolume + bugVolume*(GROWTH_RATE);
            double bugOccupancy = bugVolume / schoolVolume * 100;
            System.out.println("Week " + week + ". Current occuppancy:s " +  String.format("%.2f", bugOccupancy) + "%");
        } while(schoolVolume > bugVolume);

        keyboard.close();

    }
}