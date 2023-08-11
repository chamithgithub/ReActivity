import java.util.Arrays;

public class FindSmallestNumber {

    int givenArray []= {9,4,5,2,8};

//    method 01
    public void findSmallestValue() {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < smallest) {
                smallest = givenArray[i];
            }

        }
        System.out.println(smallest);
    }

    //method 02
    public void usingArray(){
        Arrays.sort(givenArray);
        System.out.println(givenArray[0]);
    }


    public static void main (String args []){

    FindSmallestNumber small =new FindSmallestNumber();
//        small.findSmallestValue();
        small.usingArray();
    }
}
