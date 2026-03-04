class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int cnt = 0;
        int[] rowcnt = new int[m];
        int[] colcnt = new int[n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1){
                    rowcnt[i]++;
                    colcnt[j]++;
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1 && rowcnt[i] == 1 && colcnt[j] == 1){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}