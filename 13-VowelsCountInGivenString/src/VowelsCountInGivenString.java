public class VowelsCountInGivenString {
    public static void main(String[] args) {
        String input ="chamith Dilshan";
        int count =0;

        input = input.toLowerCase();

        for (int i=0; i<input.length(); i++){
            if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
            count++;

        }
        System.out.println("this sentence has "+count+" vowels .");
    }
}
