class Solution {
    public int[] solution(long n) {
        String a = Long.toString(n);
        int[] answer = new int[a.length()];

        for(int i = 0; i < a.length(); i++){
            answer[i] = (int)(n % 10);
            n /= 10;
        }
        return answer;
    }
}