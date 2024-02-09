package strings;

public class CountVowels {
    public static int countVowels(String str){
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";

        for (int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);

            if (vowels.indexOf(ch) !=-1){
                vowelCount++;

            }
        }
        return vowelCount;
    }


}
