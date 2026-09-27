class Solution {
    public boolean isSameAfterReversals(int num) {
    int originalNum = num;

        int reversedNum1 = 0;

        while(num != 0){
            int digit = num % 10;
            reversedNum1 = reversedNum1 * 10 + digit;
            num /= 10;
        }

        int temp  = reversedNum1;
        int reversedNum2 = 0;

        while(temp != 0){
            int digit = temp % 10;
            reversedNum2 = reversedNum2 * 10 + digit;
            temp /= 10;
        }
        
        if (originalNum == reversedNum2){
            return true;
        }
        else{
            return false;
        }
    }
}