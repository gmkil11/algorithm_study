import java.util.HashSet;

public class AlienDictionary {
    public static int isSpellInDic(char[] spell, String[] dic) {
        HashSet<String> spellPermutations = generatePermutations(spell);

        for (String perm : spellPermutations) {
            if (containsWord(dic, perm)) {
                return 1; // 단어가 dic에 존재하면 1 반환
            }
        }

        return 2; // 모든 순열로 만든 단어가 dic에 없으면 2 반환
    }

    private static HashSet<String> generatePermutations(char[] spell) {
        HashSet<String> permutations = new HashSet<>();
        generatePermutationsHelper(spell, 0, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(char[] spell, int index, HashSet<String> permutations) {
        if (index == spell.length) {
            permutations.add(new String(spell));
            return;
        }

        for (int i = index; i < spell.length; i++) {
            // 현재 문자와 다른 문자와 위치를 교환하여 순열을 생성
            swap(spell, index, i);
            generatePermutationsHelper(spell, index + 1, permutations);
            // 다시 원래대로 돌려놓음
            swap(spell, index, i);
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean containsWord(String[] dic, String word) {
        for (String entry : dic) {
            if (entry.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] spell1 = {'p', 'o', 's'};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(isSpellInDic(spell1, dic1)); // 결과: 2

        char[] spell2 = {'z', 'd', 'x'};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        System.out.println(isSpellInDic(spell2, dic2)); // 결과: 1

        char[] spell3 = {'s', 'o', 'm', 'd'};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(isSpellInDic(spell3, dic3)); // 결과: 2
    }
}
