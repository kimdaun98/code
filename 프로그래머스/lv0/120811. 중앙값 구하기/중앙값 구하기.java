import java.util.Arrays;

class Solution {
    public double solution(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length % 2 == 0) {
            return (double) (array[length / 2 - 1] + array[length / 2]) / 2;
        } else {
            return array[length / 2];
        }
    }
}
