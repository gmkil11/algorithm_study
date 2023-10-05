import java.util.HashSet;

public class ClassName {
    public static void main(String[] args) {

        HashSet<String> wordSet = new HashSet<>();
        wordSet.add("apple");

        char[] targetWord1 = {'a', 'p', 'p', 'l', 'e'};
        System.out.println(wordSet.contains(targetWord1));
    }
}
