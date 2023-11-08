import java.util.Scanner;

/**
 * @author A.C.Dilshan
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int count =0;

        if (1<number){

            for (int i=1;i<=number;i++){
                if(number % i == 0 )
                    count ++;
                }
                if(count==2){
                    System.out.println(number +" is prime number");
                }else {

                System.out.print("not a prime number");
                }


        }else{
                System.out.print("not a prime number");
            }

//method 2
//        if (isPrime(number)) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }
//    }
//    public static boolean isPrime(int number) {
//        if (number <= 1) {
//            return false; // Numbers less than or equal to 1 are not prime.
//        }
//        if (number <= 3) {
//            return true; // 2 and 3 are prime.
//        }
//        if (number % 2 == 0 || number % 3 == 0) {
//            return false; // Divisible by 2 or 3, not prime.
//        }
//
//        for (int i = 5; i * i <= number; i += 6) {
//            if (number % i == 0 || number % (i + 2) == 0) {
//                return false; // Divisible by numbers of the form 6k ± 1, not prime.
//            }
//        }
//
//        return true; // If no divisors are found, the number is prime.
    }
}