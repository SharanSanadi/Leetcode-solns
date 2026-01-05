import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);              
            String key = new String(ch);  //  make key

            // Step 3: add to map
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        //  return grouped values
        return new ArrayList<>(map.values());
    }
}
