class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int[] rank = {6,5,4,3,2,1};
        
        int count = 0;
        int zeroCount = 0;
        
        for(int i = 0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
                zeroCount++;
            }
            
            for(int j = 0; j<win_nums.length; j++) {
                if(win_nums[j] == lottos[i]) {
                    count++;
                }
            }
            
        }
        
        if(zeroCount == 6) {
            answer[0] = 1;
            answer[1] = 6;
        } else {
            
            if(count+zeroCount > 1) {
                answer[0] = rank[count+zeroCount-1];
                answer[1] = rank[count-1];
            } else {
                answer[0] = 6;
                answer[1] = 6;
            }
                
            
        }
        
        return answer;
    }
}