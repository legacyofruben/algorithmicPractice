package AlgorithmsCourse.IsUnique;

import java.util.HashSet;

public class IsUnique {

    public static boolean isUnique(String input){
        if(input==null || input.length()>128) return false;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if(set.contains(input.charAt(i))){
                return false;
            }else{
                set.add(input.charAt(i));
            }
        }
        return true;
    }
}
