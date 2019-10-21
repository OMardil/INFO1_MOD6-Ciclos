import java.util.*;

public class ParrotSalute {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How big is your group?: ");
        int groupSize = keyboard.nextInt();

        while (groupSize <= 0 || groupSize >= 11){
            System.out.print("Hmm that doesn't seem right. How big is your group: ");
            groupSize = keyboard.nextInt();            
        }

        String salute = "";
        for(int i = 0; i < groupSize; i++){
            salute = salute + "Hi";
            if (i < (groupSize-1)){
                salute = salute + "-";
            }
        }

        System.out.println(salute);
    }
}
