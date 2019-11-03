public class FizzBuzz{

    public static void main(String[] args){


        for (int i = 1; i<=100; i++){

            boolean b1 = true;

            if (i % 3 == 0){
                System.out.print("Fizz");
                b1 = false;
            }
            if (i % 5 == 0){
                System.out.print("Buzz");
                b1 = false;                
            }

            if (b1) {
                System.out.print(i);
            }

            System.out.println();
        }

    }

}