public class SampleLoop {
    public static void main(String[] args) {
        int bits = 1;
        int maxValues = 1;
        while (bits <= 8) {
            maxValues *= 2;
            System.out.println(bits + " bit(s) -> " + maxValues + " values");
            bits++;
        }
    }
}