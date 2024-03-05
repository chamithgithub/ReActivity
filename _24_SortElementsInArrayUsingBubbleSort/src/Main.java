import java.util.Arrays;

/**
 * @author A.C.Dilshan
 */
public class Main {
//    public static void main(String[] args) {
//        int ar [] ={5,1,4,2,8};
//
//        int n =ar.length;
//
//        System.out.println("before"+Arrays.toString(ar));
//
//        for (int i=0;i<n-1;i++) {
//
//            for (int j=0;j<n-1;j++) {
//              if (ar[j]>ar[j+1]){
//                    int temp=ar[j];
//                    ar[j]=ar[j+1];
//                    ar[j+1]=temp;
//              }
//            }
//
//        }
//        System.out.println("after"+Arrays.toString(ar));
//    }
public static void main(String[] args) {

   int  ar[] ={5,2,3,4,7,6};
   int temp=0;

    System.out.println("before"+Arrays.toString(ar));

   for (int i=0;i< ar.length-1;i++){
       for (int j=0;j<ar.length-1;j++){
           if (ar[j]>ar[j+1]) {
           temp=ar[j];
           ar[j]=ar[j+1];
           ar[j+1]=temp;
           }
           }
       }
    System.out.println("after"+Arrays.toString(ar));
   }


}

