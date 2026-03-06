class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;

        for(int i = 0; i < words.length; i++){
            boolean is_match = true;

            if(words[i].length() < pref.length())
                continue;

            for(int j = 0; j < pref.length(); j++){
                if(words[i].charAt(j) != pref.charAt(j)){
                    is_match = false;
                    break;
                }
            }

            if(is_match)
                count++;
        }

        return count;
    }
}