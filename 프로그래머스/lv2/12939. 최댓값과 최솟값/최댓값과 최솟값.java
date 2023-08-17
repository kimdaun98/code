class Solution {
    public String solution(String s) {
        String answer = "";
        String[] cut = s.split(" ");
        int[] numbers = new int[cut.length];

        for (int i = 0; i < cut.length; i++) {
            numbers[i] = Integer.parseInt(cut[i]);
        }

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < numbers[minIndex]) {
                minIndex = i;
            }
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        answer = numbers[minIndex] + " " + numbers[maxIndex];
        return answer;
    }
}
