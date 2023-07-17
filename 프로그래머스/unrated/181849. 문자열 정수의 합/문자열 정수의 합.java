class Solution {
    public static int solution(String num_str) {
        int total_sum = 0;
        for(int i = 0; i < num_str.length(); i++) {
            total_sum += Character.getNumericValue(num_str.charAt(i));
        }
        return total_sum;
    }
}