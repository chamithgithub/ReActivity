import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSmallestNumber {

    Integer givenArray []= {9,4,5,8,8};

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

    //method 03
    public void usingCollections(){
        List<Integer> list = Arrays.asList(givenArray);
        Collections.sort(list);
        int smallest =list.get(0);
        System.out.println(smallest);
    }


    public static void main (String args []){

    FindSmallestNumber small =new FindSmallestNumber();
//        small.findSmallestValue();
//        small.usingArray();
            small.usingCollections();
    }
}
