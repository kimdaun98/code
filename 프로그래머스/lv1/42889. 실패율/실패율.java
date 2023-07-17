import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double[] ch = new double[N+1];
        double[] cu = new double[N+1]; 
        List<double[]> fail = new ArrayList<double[]>(); 
        
        for (int i=0; i<=stages.length-1; i++) {
            for (int j=0; j<=stages[i]-1; j++) {
                ch[j]++;
            }
            cu[stages[i]-1]++;
            if (stages[i] == N+1) {
            }
        }
        
        for (int i=0; i<N; i++) {
            if(ch[i] == 0) {
                fail.add(new double[]{i,0});
            } else {
                fail.add(new double[]{i,cu[i] / ch[i]});
            }
        }
        
        fail.sort((a,b)->Double.compare(b[1],a[1]));
        
        for (int i=0; i<fail.size(); i++) {
            answer[i] = (int)fail.get(i)[0]+1;
        }
        
        return answer;
    }
}