class Solution {
    public int solution(int[] num_list) {
        int answer = num_list[0];
        if(num_list.length == 1){
            return answer;
        }
        if (num_list.length > 10) {
            for (int i = 1; i < num_list.length; i++) {
                answer += num_list[i];
            }
        } else {
            for (int i = 1; i < num_list.length; i++) {
                if(num_list[i]!=0){
                    answer = answer * num_list[i];
                }
            }
        }
        return answer;
    }
}