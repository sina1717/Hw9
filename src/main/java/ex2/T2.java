package ex2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class T2 {
    public static void main(String[] args) {
        Set<Character> setA = new TreeSet<>();
        Set<Character> setB = new TreeSet<>();
        fillSet(setA);
        fillSet(setB);
        System.out.println(setA);
        System.out.println(setB);
        System.out.println("union of two set is " + union(setA,setB));
        System.out.println("Subscription of two set is " + subscription(setA,setB));

    }

    private static void fillSet(Set<Character> set){
        Random random = new Random();

        int i=0;
        while ( i<10) {
            char randomizedCharacter = (char) (random.nextInt(26) + 'a');
            if(set.add(randomizedCharacter))
                i++;
        }
    }

    public static Set<Character> union(Set<Character> s1 , Set<Character> s2 ){
        Set<Character> result = new TreeSet<>();
        for (Character c:  s1) {
            result.add(c);
        }
        for (Character c:  s2) {
            result.add(c);
        }
        return result;
    }

    public static Set<Character> subscription(Set<Character> s1 ,Set<Character> s2){
        Set<Character> result = new TreeSet<>();
        for (Character c1: s1) {
            for (Character c2:  s2) {
                if(c1.equals(c2))
                    result.add(c1);
            }
        }
        return result;
    }
}
