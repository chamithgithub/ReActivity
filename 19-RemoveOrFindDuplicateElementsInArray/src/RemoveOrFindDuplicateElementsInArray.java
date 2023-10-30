import java.util.ArrayList;

public class RemoveOrFindDuplicateElementsInArray {
    public static void main(String[] args) {

        int [] inputArray={1,2,3,4,2,3,4,6,8,1};
        ArrayList<Integer> duplicats =  removeOrFindDuplicates(inputArray);

        System.out.println(duplicats);

    }
    public static ArrayList<Integer> removeOrFindDuplicates(int [] arr){
        ArrayList<Integer> removeDuplicate =new ArrayList<>();
        ArrayList<Integer> findDuplicate =new ArrayList<>();

        for (int num: arr) {
            if (!removeDuplicate.contains(num)){
                removeDuplicate.add(num);
            }else{
                findDuplicate.add(num);

            }

        }
        return removeDuplicate;
    }
}
