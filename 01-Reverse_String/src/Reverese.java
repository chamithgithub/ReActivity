public class Reverese {
    public static void main(String[] args) {

        String word ="ABCD";
        String reverse ="";

        //method 01
        int length =word.length();

        for (int i=length-1 ; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);
    }
}
