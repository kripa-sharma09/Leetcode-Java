class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reversed_num = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed_num)) {
            return true;
        } else {
            return false;
        }
    }
}