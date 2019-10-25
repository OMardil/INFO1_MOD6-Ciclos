public class InvertNumbers {

    public static void main(String[] args) {
        int i = 10;
        int n = 2453;
        int mod = 0;
        String out = "";

        while (i < n) {
            mod = n % i;
            n -= mod;
            out += mod;
            i *= 10;
        }

        System.out.println(out);
    }

}