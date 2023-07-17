class Solution {
    public int solution(int[] numbers) {
        
        int answer = 0;
        int num[] = new int []{1,2,3,4,5,6,7,8,9,0};
        for(int i = 0; i<numbers.length; i++){
            for(int j = 0; j<num.length; j++){
                if(numbers[i]==num[j]){
                    num[j] = 0;
                }
            }
        }


        for(int i = 0; i<num.length; i++){
            answer += num[i];
        }
        return answer;
    }
}