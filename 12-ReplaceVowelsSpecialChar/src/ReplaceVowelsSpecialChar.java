public class ReplaceVowelsSpecialChar {
    public static void main(String[] args) {
        String givenText = "i like my dream car";

        //aproach 01

        char[] toCharArray = givenText.toCharArray();

        for (int i =0; i<givenText.length();i++){
            if(givenText.charAt(i)=='A'|| givenText.charAt(i)=='E'|| givenText.charAt(i)=='I'|| givenText.charAt(i)=='O'|| givenText.charAt(i)=='U'
                    || givenText.charAt(i)=='a'|| givenText.charAt(i)=='e'|| givenText.charAt(i)=='i'|| givenText.charAt(i)=='o'|| givenText.charAt(i)=='u')

                toCharArray[i]='*';
        }
        for (int i =0; i<givenText.length();i++){
            System.out.print(toCharArray[i]);
        }

        }



        }




