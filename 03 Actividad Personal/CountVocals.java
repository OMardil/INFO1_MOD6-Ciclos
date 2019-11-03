public class CountVocals{

    public static void main(String[] args){

        String s1 = generateRandomString();

        int count = 0;
        for (int i = 1; i<s1.length()-1; i++){
            if (s1.charAt(i) == 'a' || s1.charAt(i)== 'e' || s1.charAt(i)== 'i' || s1.charAt(i)== 'o' || s1.charAt(i)== 'u' ){
                count++;
            }
        }

        System.out.println("Found "+ count);

    }

    public static String generateRandomString() {
        return "zzaii";
    }

}