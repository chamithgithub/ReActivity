import java.util.Scanner;

public class FindLargestOfNumber3 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter 1st Num : ");
        int a = input.nextInt();

        System.out.print("Enter 2nd Number :");
        int b = input.nextInt();

        System.out.print("Enter 3rd Number :");
        int c =input.nextInt();

// logical operator use

//if (a>b && a>c){
//    System.out.println(a+" largest ");
//
//}else if (b>a && b>c){
//    System.out.println(b+" largest");
//
//}else {
//            System.out.println(c+" largest ");
//        }

//ternary operator
        int largest1 = a>b ? a:b;
        int largest2 = c > largest1 ? c : largest1;
        System.out.println(largest2 +" is largest");


    }
}
