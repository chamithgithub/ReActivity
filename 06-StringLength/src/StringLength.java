public class StringLength {
    public static void main (String args []){
//        find the length of string
        String x ="hello oyata komada";
        System.out.println(x.length());

        //        find the length of string without length method
        char[] toCharArray = x.toCharArray();

        int length=0;
        for (Character c: toCharArray){
            length++;
        }
        System.out.println(length);
    }

}
