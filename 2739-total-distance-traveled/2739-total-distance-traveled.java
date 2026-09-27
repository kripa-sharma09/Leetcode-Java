class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int maxDistance = 0;

        while(mainTank >= 5 && additionalTank > 0){
            mainTank -= 5;
            mainTank++;
            additionalTank --;
            maxDistance += 5;
        }
        return (maxDistance + mainTank)*10;
    }
}