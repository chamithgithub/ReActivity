/**
 * @author A.C.Dilshan
 */
public class Main {
    public static void main(String[] args) {
        int ar [] ={1,2,6,2,8,3,7};

//        System.out.print("even : ");
//       for (int i=0 ;i<ar.length ; i++) {
//           if (ar[i] % 2 == 0)
//               System.out.print(ar[i]);
//       }
//
//       System.out.println();//  line breack
//
//           System.out.print("odd : ");
//           for (int i=0 ;i<ar.length ; i++) {
//               if (ar[i] % 2 != 0)
//                   System.out.print(ar[i]);
//           }

//           method 02

        System.out.print("even : ");
        for (int even:ar) {
            if (even%2 ==0)
                System.out.print(even);
        }

        System.out.println();//  line breack

        System.out.print("odd : ");
        for (int odd:ar) {
            if (odd%2 !=0)
                System.out.print(odd);
        }



    }
}