class Solution {
    public int lengthOfLongestSubstring(String s) {
        int right = 0;
        int left = 0;
        int maxlen = 0;
        HashSet<Character> set = new HashSet<>();

        while(right < s.length()){
            char ch = s.charAt(right);

            if(!set.contains(ch)){
                set.add(ch);
                int currlength = right - left + 1;
                maxlen = Math.max(maxlen,currlength);
                right++;
            }
            else{
                while(set.contains(ch))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
        }
        return maxlen;
    }
}