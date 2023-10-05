import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DataType {
    public static int isIn(char[] spell, String[] dic) {
        Set<Character> spellSet = new HashSet<>();

        // 제한사항 : spell의 원소는 알파벳 소문자로만 이루어져야 한다.
        for (char sp : spell) {
            if (!Character.isLowerCase(sp)) {
                throw new IllegalArgumentException("spell의 원소는 알파벳 소문자로만 이루어져야 합니다.");
            }
            spellSet.add(sp); // 소문자라면 spellSet에 넣는다.
        }

        // 제한사항: 2 ≤ spell의 크기 ≤ 10
        if (spell.length < 2 || spell.length > 10) {
            throw new IllegalArgumentException("spell의 크기는 2 이상 10 이하이어야 합니다.");
        }

        // 제한사항: spell의 원소의 길이는 1
        for (char sp : spell) {
            if (sp < 'a' || sp > 'z') {
                throw new IllegalArgumentException("spell의 원소는 알파벳 소문자 1개여야 합니다.");
            }
        }

        // 제한사항: 1 ≤ dic의 크기 ≤ 10
        if (dic.length < 1 || dic.length > 10) {
            throw new IllegalArgumentException("dic의 크기는 1 이상 10 이하이어야 합니다.");
        }

        for (String d : dic) {
            // 제한사항: 1 ≤ dic의 원소의 길이 ≤ 10
            if (d.length() < 1 || d.length() > 10) {
                throw new IllegalArgumentException("dic의 원소의 길이는 1 이상 10 이하이어야 합니다.");
            }

            // 제한사항: dic과 spell 모두 중복된 원소를 갖지 않는다.
            Set<Character> dicSet = new HashSet<>();
            for (char c : d.toCharArray()) {
                if (!Character.isLowerCase(c)) {
                    throw new IllegalArgumentException("dic의 원소는 알파벳 소문자로만 이루어져야 합니다.");
                }
                dicSet.add(c);
            }
            // dicSet이 spellset을 모두 포함하고 있을경우 1 반환
            if (dicSet.containsAll(spellSet)) {
                return 1;
            }
        }
        // 아닐경우 2 반환
        return 2;
    }

    public static void main(String[] args) {
        char[] spell1 = {'p', 'o', 's'};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.printf("spell   dic        result%n%s %s %d", Arrays.toString(spell1), Arrays.toString(dic1), isIn(spell1, dic1));

        char[] spell2 = {'z', 'd', 'x'};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        System.out.printf("%n%s %s %d", Arrays.toString(spell2), Arrays.toString(dic2), isIn(spell2, dic2));

        char[] spell3 = {'s', 'o', 'm', 'd'};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.printf("%n%s %s %d", Arrays.toString(spell3), Arrays.toString(dic3), isIn(spell3, dic3));
    }
}