import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LetterCombination {
    Map<Character, String> digitToChar = Map.of(
            '2',
            "abc",
            '3',
            "def",
            '4',
            "ghi",
            '5',
            "jkl",
            '6',
            "mno",
            '7',
            "pqrs",
            '8',
            "tuv",
            '9',
            "wxyz"
    );
    LetterCombination(){}
    public List<String> letterCombinations(String digits) {

        if(digits.isEmpty()){
            return new ArrayList<>();
        }

        ArrayList<String> combinations = new ArrayList<>();
        char[] charArray = digits.toCharArray();

        backtrack(combinations, charArray, 0, "");
        System.out.println(combinations);
        return combinations;
    }

    private void backtrack(ArrayList<String> combinations, char[] charArray, int currentIndex, String stringCreated) {

        if(stringCreated.length() == charArray.length){
            combinations.add(stringCreated);
            return;
        }

        char[] newArr = digitToChar.get(charArray[currentIndex]).toCharArray();
        for(char singleChar: newArr){
            backtrack(combinations, charArray, currentIndex+1, stringCreated+singleChar);
        }

    }

    public static void main(String[] args) {
        new LetterCombination().letterCombinations("");
    }

}
