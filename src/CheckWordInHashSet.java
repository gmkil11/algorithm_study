import java.util.HashSet;

public class CheckWordInHashSet {
    public static void main(String[] args) {
        HashSet<String> wordSet = new HashSet<>();
        wordSet.add("apple");
        wordSet.add("mango");
        wordSet.add("car");

        char[] targetWord1 = {'a', 'p', 'p', 'l', 'e'};
        char[] targetWord2 = {'m', 'a', 'n', 'g', 'o'};
        char[] targetWord3 = {'c', 'a', 'r'};

        boolean containsWord1 = containsWord(wordSet, targetWord1);
        boolean containsWord2 = containsWord(wordSet, targetWord2);
        boolean containsWord3 = containsWord(wordSet, targetWord3);

        System.out.println("Contains 'apple': " + containsWord1);
        System.out.println("Contains 'mango': " + containsWord2);
        System.out.println("Contains 'car': " + containsWord3);
    }

    public static boolean containsWord(HashSet<String> wordSet, char[] targetWord) {
        String target = new String(targetWord); // char 배열을 문자열로 변환
        return wordSet.contains(target);
    }
}
