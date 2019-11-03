public class RomanNumberals {
    public static void main(String[] args) {

        for (int i = 1; i < 400; i++) {

            int number = i;
            String output = "";

            while (number >= 100) {
                output += "C";
                number -= 100;
            }

            while (number >= 90) {
                output += "XC";
                number -= 90;
            }

            while (number >= 50) {
                output += "L";
                number -= 50;
            }

            while (number >= 40) {
                output += "XL";
                number -= 40;
            }

            while (number >= 10) {
                output += "X";
                number -= 10;
            }

            while (number == 9) {
                output += "IX";
                number -= 10;
            }

            while (number >= 5) {
                output += "V";
                number -= 5;
            }

            while (number == 4) {
                output += "IV";
                number -= 4;
            }

            while (number >= 1) {
                output += "I";
                number -= 1;
            }

            System.out.println(output);

        }

    }

}