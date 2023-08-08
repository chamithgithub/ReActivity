import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
//            //1 use star
//                Scanner input =new Scanner(System.in);
//                System.out.print("Enter row size :");
//        int numberRow = input.nextInt();
//
//        int row,column =0;
//
//        for (row=0; row < numberRow; row++){
//            for (column=0; column<=row; column++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

            //2 use number
        Scanner input2 =new Scanner(System.in);
        System.out.print("Enter row size :");
        int limit = input2.nextInt();
        int starting_num =1;

        int row2,column2;
        for (row2=0; row2<limit; row2++){
            for (column2=0; column2<=row2;column2++){
                System.out.print(starting_num+" ");
                starting_num++;
            }
            System.out.println();
        }
    }
}