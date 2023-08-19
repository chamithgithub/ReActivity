public class SumOfIntInAString {
    public static void main(String[] args) {
        String input ="chamith1234";
        int total=0;

        for(int i=0; i<input.length();i++){
           char character = input.charAt(i);

           if (Character.isDigit(character)){
                total=total+Character.getNumericValue(character);
           }

        }
        System.out.println(total);
    }
}
