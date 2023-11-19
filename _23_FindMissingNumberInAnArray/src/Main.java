/**
 * @author A.C.Dilshan
 */
public class Main {
    public static void main(String[] args) {

        int sum =0;

        int ar[] ={1,2,4,5};

        for (int i=0; i<ar.length;i++){
            sum=sum+ar[i];
        }

        System.out.println("sum of element in given array :"+sum);

        int sum2=0;
        for (int i=0; i<=5; i++){
            sum2=sum2+i;
        }
        System.out.println("sum of 2 :"+sum2);

        System.out.println("missing number is :"+(sum2-sum));

    }
}