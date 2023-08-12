public class ReverseWordInSentence {
    public static void main (String args []){
        String word ="Learn Automation in Sinhala ";
        String rWord ="";

        String[] split = word.split(" ");//space ekk dunnama space tika ain karala index deno
        int count =split.length;

        System.out.println(count);
        for (int i= split.length-1;i>=0;i--){
        rWord = rWord + split[i]+" ";

        }
        System.out.println(rWord);

    }

}
