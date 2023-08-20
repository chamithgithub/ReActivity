public class CountSumOfDigits{
    public static void main(String[] args) {
        int input = 1511;
        int sum=0;

        while (input>0){
          sum= sum+input%10;


           input=input/10;
        }
        System.out.println(sum);
    }
        }
