class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int maxlen = 0;
        int maxfreq = 0;
        while(right < s.length()){
            char ch = s.charAt(right);

            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq = Math.max(maxfreq,map.get(ch));

            while((right - left + 1) - maxfreq > k){
                char leftchar = s.charAt(left);
                map.put(leftchar, map.get(leftchar) - 1);
                if(map.get(leftchar) == 0){
                    map.remove(leftchar);
                }
                left++;
            }
            maxlen = Math.max(maxlen, right - left + 1);
            right++;

        }
        return maxlen;
    }
}