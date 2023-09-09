lass Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max=numBottles;
        while(numBottles>=numExchange)
        {
            max+=numBottles/numExchange;
            numBottles=numBottles/numExchange+numBottles%numExchange;
        }
        return max;
    }
}
