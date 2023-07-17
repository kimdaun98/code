class Solution {
    public int solution(String s) {
        int answer = 0;
        if(s.charAt(0)!='-'){
            String a = s.substring(0, s.length());
            answer = Integer.parseInt(a);
        }else{
            String a = s.substring(1, s.length());
            answer = Integer.parseInt(a)*-1;
        }

        
        
        return answer;
    }
}