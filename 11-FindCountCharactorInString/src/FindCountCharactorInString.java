public class FindCountCharactorInString {
    public static void main(String[] args) {
//        //using iteration
//        String input ="chamithdilshan";
//        char toFind ='h';
//
//        int count =0 ;
//
//        input = input.toLowerCase();
//
//        for (int i=0; i<input.length();i++){
//
//            if (input.charAt(i)==toFind){
//                count= count+1;
//            }else {
//
//            }
//        }
//        System.out.println(toFind +" is present "+count+" Number of times. ");

        //using without iteration

            String input ="chamithdilshan";
            char toFind ='s';

            input = input.toUpperCase();

            String chartoFind = Character.toString(toFind).toUpperCase();

            int actualLength = input.length();
        System.out.println(actualLength);

        input=input.replace(chartoFind,"");
        int lengthAfterReplcing =input.length();

        System.out.println(lengthAfterReplcing);


        System.out.println(actualLength-lengthAfterReplcing);




    }
}
