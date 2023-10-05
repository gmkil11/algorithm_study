import java.util.Arrays;

public class Ex01 {
    public static int isIn(char[] spell, String[] dic){
        for (String d : dic) {
            int cnt = 0;
            for (char sp : spell) {
                if (d.indexOf(sp) > -1) {
                    cnt++;
                }
            }
            if (cnt >= spell.length) {
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        char[] spell1 = {'p', 'o', 's'};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.printf("spell   dic        result%n%s %s %d", Arrays.toString(spell1), Arrays.toString(dic1),isIn(spell1, dic1));

        char[] spell2 = {'z', 'd', 'x'};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        System.out.printf("%n%s %s %d", Arrays.toString(spell2), Arrays.toString(dic2),isIn(spell2, dic2));

        char[] spell3 = {'s', 'o', 'm', 'd'};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        System.out.printf("%n%s %s %d", Arrays.toString(spell3), Arrays.toString(dic3),isIn(spell3, dic3));
    }
}