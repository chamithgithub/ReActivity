import java.util.Scanner;

public class FindAlphabetPosition {
public static void main(String args []){
    Scanner input =new Scanner(System.in);
    System.out.print("Enter a English Letter :");

    char letter =input.next().charAt(0);
    letter=Character.toLowerCase(letter);

    int asciiValue = (int)letter;
    System.out.println(asciiValue);

    int position =asciiValue -96;
    System.out.println(position);


}

}
