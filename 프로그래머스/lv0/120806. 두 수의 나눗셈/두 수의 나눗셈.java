class Solution {
    public int solution(int num1, int num2) {
        double a = ((num1*1.0)/num2);
        double b = a*1000;
        int answer = (int)b;
        return answer;
    }
}