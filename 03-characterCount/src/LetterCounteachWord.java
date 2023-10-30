
import java.util.HashMap;

public class LetterCounteachWord {
    public static void main(String[] args) {

        eachWord("Chamith");
    }
    public static void eachWord(String typeText){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
       char[] toCharArray = typeText.toCharArray();
        for (Character c:toCharArray) {
            if (map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        System.out.println(map);

    }

}
