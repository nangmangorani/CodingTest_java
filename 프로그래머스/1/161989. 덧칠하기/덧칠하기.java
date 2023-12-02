class Solution {
    public int solution(int n, int m, int[] section) {
        
        
        int start = section[0];
        
        int answer = 1;
        
        for(int num : section) {
            if(num - start >= m) {
                answer++;
                start = num;
            }
        }
        
        return answer;
        
    }
}