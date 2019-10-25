public class CountDigits{
    public static void main(String[] args){

        int i1 = -1305;
        int digitCount = 0;

        if (i1 < 0){
            i1 = Math.abs(i1);
        }

        while (i1 > 0){
            digitCount++;
            i1 /= 10;
        }

        System.out.println(digitCount);

    }

}