import java.util.ArrayList;
import java.util.HashSet;

public class RemoveOrFindDuplicateElementsInArray {
    public static void main(String[] args) {

        int [] inputArray={1,2,3,4,2,3,4,6,8,1};

//        ArrayList<Integer> duplicats =  removeOrFindDuplicates(inputArray);
//        System.out.println(duplicats);

        removeDuplicate(inputArray);
    }


//    method 01

//    public static ArrayList<Integer> removeOrFindDuplicates(int [] arr){
//        ArrayList<Integer> removeDuplicate =new ArrayList<>();
//        ArrayList<Integer> findDuplicate =new ArrayList<>();
//
//        for (int num: arr) {
//            if (!removeDuplicate.contains(num)){
//                removeDuplicate.add(num);
//            }else{
//                findDuplicate.add(num);
//
//            }
//
//        }
//        return removeDuplicate;
////        return findDuplicate;
//    }

//    method 02
    public static void removeDuplicate(int [] arr){
        HashSet<Integer> uniqList =new HashSet<>();

//        for (int num:arr) {
//            if (uniqList.add(num)==false){
//                System.out.println("duplicate is :"+num);
//            }
//        }
        for (int num:arr) {
            uniqList.add(num);

        }
        System.out.println("After remove duplicate ,showing elements :"+uniqList);
    }

}
