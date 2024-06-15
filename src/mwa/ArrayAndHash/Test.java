package mwa.ArrayAndHash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    Test(){
        double as = System.nanoTime();
        System.out.println(countUniqueSubstrings("bcada"));
        System.out.println(System.nanoTime() - as);
        //b , c ,  a , d , a , bc, bca, bcad, ca, cad, ad, da
        //b, c, bc, a, bca,
    }
    public static int countUniqueSubstringSudin(String s) {
        int count = 0;
        for(int i =0; i<s.length(); i++){
            TreeSet<Character> set = new TreeSet<>();
            for(int j = 0; j<i; j++){
                if(checkUnique(s, i, j)){
                    count++;
                };
            }
        }
        System.out.println(count);
        return 1;
    }

    private static boolean checkUnique(String s, int i, int j) {
        TreeSet<Character> set = new TreeSet<>();
        for(int k = i; k<j+1; k++){
            if(set.contains(s.charAt(k))){
                return false;
            }
            set.add(s.charAt(k));
        }
        return true;
    }

    public static int countUniqueSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[128];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);

                if (hash[ch] > 0)
                    break;

                hash[ch]++;
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        new Test();
    }
}
