

public class FindSmallestNumber {
//        method 01
    int givenArray []= {9,4,5,3,1};

    public void findSmallestValue() {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] < smallest) {
                smallest = givenArray[i];
            }

        }
        System.out.println(smallest);
    }


    public static void main (String args []){

    FindSmallestNumber small =new FindSmallestNumber();
        small.findSmallestValue();
    }
}
