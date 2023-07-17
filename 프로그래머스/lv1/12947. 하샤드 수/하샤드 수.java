class Solution {
    public boolean solution(int x) {

        int a = x;
        int sum = 0;

        while(x != 0){
            sum += x%10;
            x /= 10;
        }
        return a%sum == 0 ? true:false ;
        
    }
}