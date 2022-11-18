package linkedlistQ;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Link {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        LinkedList<Integer> ls = new LinkedList<>();
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        if (!(s.length() == t.length())) {
            return false;
        }

        HashMap<Character, Integer> an = new HashMap<>();
        HashMap<Character, Integer> an2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            an.merge(s.charAt(i),1,Integer::sum);
            an2.merge(t.charAt(i), 1, Integer::sum);
        }

        return an.equals(an2);
    }


    static int a=1;
    static int b=2;
    static int c=b;
    public static int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return c;
        }
        c=b+a;
        a=b;
        b=c;
        return 0;
    }
}
