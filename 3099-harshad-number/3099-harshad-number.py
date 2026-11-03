class Solution:
    def sumOfTheDigitsOfHarshadNumber(self, x: int) -> int:

        sum = 0
        num = x

        while(x>0):
            sum = sum + (x%10)
            x = x //10

        return sum if num % sum == 0 else -1
        