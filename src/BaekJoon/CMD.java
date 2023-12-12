package BaekJoon;

import java.util.Scanner;

public class CMD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder value = new StringBuilder();
        int T = sc.nextInt();
        String[] arrays = new String[T];
        for(int i=0;i<T;i++) {
            arrays[i] = sc.next();
        }

        boolean isSame = true;
        for (int i=0; i < arrays[0].length(); i++){
            char c = arrays[0].charAt(i);

            for (int j=1; j<T; j++){
                if (c!=arrays[j].charAt(i)) {
                    isSame=false;
                    break;
                }
            }

            if(isSame==true){
                value.append(c);
            } else {
                value.append("?");
            }
        }

        System.out.println(value);
    }
}
