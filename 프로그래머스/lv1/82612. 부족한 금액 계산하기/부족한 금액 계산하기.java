class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long totalCost = 0; 

        for(int i = 1; i <= count; i++) {
            totalCost += (long)price * i; 
        }

        answer = totalCost - money;
        if(answer < 0) { 
            answer = 0;
        }

        return answer;
    }
}
