class Solution {
    public int arrangeCoins(int n) {
        int rows = 1;
        int CompleteRows = 0;
        while( n >= rows){
            n = n- rows;
            rows ++ ;
            CompleteRows++;
        }
        return CompleteRows;
    }
}