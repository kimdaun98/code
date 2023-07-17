class Solution {
    public int solution(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // 각 자리 숫자를 구하여 sum에 더함
            n /= 10; // 다음 자리 숫자를 구하기 위해 10으로 나눔
        }
        return sum;
    }
}
