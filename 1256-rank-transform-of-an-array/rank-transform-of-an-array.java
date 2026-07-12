import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        int[] temp = arr.clone();
        Arrays.sort(temp);
        for (int num : temp) {
            if (!map.containsKey(num)) {
                map.put(num, rank);
                rank++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}