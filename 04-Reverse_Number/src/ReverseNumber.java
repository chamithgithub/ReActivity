import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Prefer Number : ");
        int num = sc.nextInt();

        //1st Using Algorithm
//
//        int reverse = 0;
//        while (num !=0){
//            reverse =reverse * 10 + num % 10;
//            num = num/10;
//        }
//        System.out.println(reverse);

        //2nd Using StringBuffer class

        StringBuffer reverse;

        StringBuffer stringBuffer =new StringBuffer(String.valueOf(num));
        reverse = stringBuffer.reverse();
        System.out.println("Reverse : "+reverse);


    }
}
