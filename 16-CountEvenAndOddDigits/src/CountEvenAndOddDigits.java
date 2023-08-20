public class CountEvenAndOddDigits {
    public static void main(String[] args) {
        int number =12123378;

        int Ecount =0;
        int Ocount =0;

        while (number >0){

         int reminder =  number%10;
         if (reminder/2 ==0){
             Ecount++;
         }else {
             Ocount++;
         }
            number=number/10;

        }
        System.out.println("even : "+Ecount );
        System.out.println("odd : "+Ocount );

    }
}
