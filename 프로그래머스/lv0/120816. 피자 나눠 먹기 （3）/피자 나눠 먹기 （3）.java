class Solution {
    public int solution(int slice, int n) {
        int total_slices = n * 1;
        int total_pizzas = total_slices / slice;
        if (total_slices % slice != 0) {
            total_pizzas += 1;
        }
        return total_pizzas;
    }
}