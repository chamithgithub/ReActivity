public class SwapTwoNum {
    public static void main(String[] args){

        //method 01
int a =10;
int b =20;

        System.out.println("Before Swapping value are a : " +a +" , b :" +b);

//        int c =a;
//        a=b;
//        b=c;
//
//method 02
//    a=a+b;
//    b=a-b;
//    a=a-b;

        //method 03
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println("After Swapping value are a : " +a +" , b :" +b);

    }
}
