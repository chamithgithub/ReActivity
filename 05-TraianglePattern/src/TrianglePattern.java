import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
            //1 use star
                Scanner input =new Scanner(System.in);
                System.out.print("Enter row size :");
        int numberRow = input.nextInt();

        int row,column =0;

        for (row=0; row < numberRow; row++){
            for (column=0; column<=row; column++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}