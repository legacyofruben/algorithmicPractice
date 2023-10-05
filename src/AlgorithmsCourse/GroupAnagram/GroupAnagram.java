package AlgorithmsCourse.GroupAnagram;


import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] words){
        if(words==null || words.length==0) return Collections.emptyList();
        var anagramMap = buildAnagram(words);
        return new ArrayList<>(anagramMap.values());
    }

    public static Map<String,List<String>> buildAnagram(String[] words){
        Map<String,List<String>> map = new HashMap<>();
        for (String s: words) {
            String hash = getAnagramHash(s);
            if(!map.containsKey(hash)){
                map.put(hash,new ArrayList<>());
            }
            map.get(hash).add(s);
        }
        return map;
    }
    public static String getHash(String anagram){
        return String.valueOf(anagram.hashCode());
    }
    public static String getAnagramHash(String s){
        int[] letterCount = new int[26];
        for (int c:s.toCharArray()) {
            letterCount[c-'a']++;
        }
        return Arrays.toString(letterCount);
    }
}
