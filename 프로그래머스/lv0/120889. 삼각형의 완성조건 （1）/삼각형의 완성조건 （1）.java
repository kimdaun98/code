class Solution {
    public int solution(int[] sides) {
        int max = Math.max(Math.max(sides[0], sides[1]), sides[2]); // 가장 긴 변 구하기
        int sum = sides[0] + sides[1] + sides[2] - max; // 나머지 두 변의 길이 합 구하기
        if (max < sum) { // 가장 긴 변의 길이가 나머지 두 변의 길이 합보다 작으면 삼각형 가능
            return 1;
        } else {
            return 2;
        }
    }
}
