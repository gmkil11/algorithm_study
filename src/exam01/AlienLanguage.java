package exam01;

import java.util.HashSet;

public class AlienLanguage {
    public static int checkSpellInDic(char[] spell, String[] dic) {
        // spell 배열을 문자열로 변환
        String spellStr = new String(spell);

        // dic의 단어들을 HashSet에 저장하여 빠른 검색 가능
        HashSet<String> dicSet = new HashSet<>();
        for (String word : dic) {
            dicSet.add(word);
        }

        // spell 배열의 모든 순열을 생성하고 dicSet에서 찾아보기
        char[] perm = new char[spell.length];
        boolean[] used = new boolean[spell.length];
        return generatePermutations(spellStr, perm, used, 0, dicSet) ? 1 : 2;
    }

    private static boolean generatePermutations(String spell, char[] perm, boolean[] used, int level, HashSet<String> dicSet) {
        if (level == spell.length()) {
            String word = new String(perm);
            return dicSet.contains(word);
        }

        for (int i = 0; i < spell.length(); i++) {
            if (!used[i]) {
                perm[level] = spell.charAt(i);
                used[i] = true;
                if (generatePermutations(spell, perm, used, level + 1, dicSet)) {
                    return true;
                }
                used[i] = false;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        char[] spell1 = {'p', 'o', 's'};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(checkSpellInDic(spell1, dic1)); // 출력: 2

        char[] spell2 = {'z', 'd', 'x'};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        System.out.println(checkSpellInDic(spell2, dic2)); // 출력: 1

        char[] spell3 = {'s', 'o', 'm', 'd'};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.println(checkSpellInDic(spell3, dic3)); // 출력: 2
    }
}
