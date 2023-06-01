import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Reverese {
    public static void main(String[] args) {

        String word ="ABCD";
        String reverse ="";
//
//        //method 01
//        int length =word.length();
//
//        for (int i=length-1 ; i>=0; i--){
//            reverse = reverse + word.charAt(i);
//        }
//        System.out.println(reverse);

        //method 02
//        char[] array = word.toCharArray();
//        int length =array.length;
//
//        for (int i=length-1 ; i>=0; i--){
//            reverse=reverse+array[i];
//        }
//
//        System.out.println(reverse);

        //method 03
//        StringBuffer stringBuffer=new StringBuffer(word);
//        System.out.println(stringBuffer.reverse());

        //method 04
        char[] array =word.toCharArray();

        List<Character> list = new ArrayList<>();
        for (Character character:array
             ) {list.add(character);
        }
        Collections.reverse(list);

        ListIterator listIterator =list.listIterator();
        while (listIterator.hasNext()){

//            System.out.println(listIterator.next());
//            D
//            C
//            B
//            A

            System.out.print(listIterator.next());
        }
    }
}
