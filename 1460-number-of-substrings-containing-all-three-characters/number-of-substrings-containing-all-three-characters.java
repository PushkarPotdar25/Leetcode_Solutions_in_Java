import java.util.*;

class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int right = 0;
        int count = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {

            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() == 3) {

                count += s.length() - right;

                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            right++;
        }

        return count;
    }
}