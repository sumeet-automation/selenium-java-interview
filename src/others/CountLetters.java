package others;

import java.util.Arrays;
import java.util.Optional;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toMap;

public class CountLetters {

    public static void main(String[] args) {
        /*String word = "Sumeet Shriya";
        Map<String, Integer> frequncyMap = new LinkedHashMap<>();
        String[] letters = word.split( "");
        for(int i=0; i<letters.length;i++){
         if(frequncyMap.get(letters[i])==null){
             frequncyMap.put(letters[i],1);
         } else {
             int value = frequncyMap.get(letters[i]);
             frequncyMap.put(letters[i],frequncyMap.put(letters[i],1)+1);
         }
        }
        System.out.println(frequncyMap.get("S"));*/

        String original = "aba";
        String reverse = "";
        int length;
        length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" + reverse);
        //TODO ONLY FOR LEARNING PURPOSES
        Optional.of(reverse).map(word->word.equals(original)).filter(CountLetters::isTrue)
                .ifPresentOrElse(print -> System.out.println("The number is palindrome"),
                () -> System.out.println("The number is not palindrome"));

        System.out.println(Arrays.stream("abcde".split("")).collect(partitioningBy(letter -> "aeiou".contains(letter))));
        System.out.println(Arrays.stream("abcde".split("")).collect(toMap(identity(), letter->letter==null?1:letter+1)));
    }

    private static boolean isTrue(Boolean output) {
        return output.equals(Boolean.TRUE);
    }
}
