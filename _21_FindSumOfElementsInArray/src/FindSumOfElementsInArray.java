/**
 * @author A.C.Dilshan
 */
public class FindSumOfElementsInArray {

    public static void main(String[] args) {

    int ar [] ={10,20,30,40,50};
    int sum =0;

//
//        for (int i=0 ;i<ar.length;i++){
//            sum=sum+ar[i];
//        }
//        System.out.println(sum);

//        method 02

        for (int a :ar) {
            sum=sum+a;
        }
        System.out.println(sum);

    }

}
