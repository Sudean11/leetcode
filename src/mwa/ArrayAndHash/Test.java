package mwa.ArrayAndHash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {
    Test(){
        double as = System.nanoTime();
        System.out.println(countUniqueSubstringSudin("bcada"));
        System.out.println(System.nanoTime() - as);
        //b , c ,  a , d , a , bc, bca, bcad, ca, cad, ad, da

        //b, c, a, d, a, bc, ca, ad, da, bca, cad, bcad

    }
    public static int countUniqueSubstringSudin(String s) {
        // window size
       //loop through the string
        // start, end
        int count =0;
        for(int windowSize = 0; windowSize < s.length(); windowSize++){
            int leftIndex = 0;
            for(int rightIndex =windowSize; rightIndex< s.length(); rightIndex++){
                if(checkUnique(s, leftIndex, rightIndex)){
                     count++;
                }
                leftIndex++;
            }
        }
        System.out.println(count);
        return count;
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
        //bcadaa
        //b , c ,  a , d , a , bc, bca, bcad, ca, cad, ad, da
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] hash = new int[128];

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (hash[ch] > 0)
                    break;

                System.out.println(ch);
                //b c a d c a d a d d a a
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
