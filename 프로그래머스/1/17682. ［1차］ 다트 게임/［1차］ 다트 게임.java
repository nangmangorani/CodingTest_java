class Solution {
    public int solution(String dartResult) {
        
        // 점수 모아두는 배열
        int[] scoreArr = new int[3];
        // 배열 인덱스
        int idx = 0;
        
        int answer = 0;
        
        int n = 0;
        
        String numStr = "";
        
        for(int i =0; i<dartResult.length(); i++) {
            char c = dartResult.charAt(i);
            
            // 10인 경우도 포함해야하니까..
            if(c >= '0' && c <= '9') {
                numStr += (c + "");
                
            } else if (c=='S' || c=='D' || c=='T') {
                n = Integer.parseInt(numStr);
                
                if(c == 'S') {
                    scoreArr[idx++] = n;
                } else if (c == 'D') {
                    scoreArr[idx++] = n * n;
                } else if (c == 'T') {
                    scoreArr[idx++] = n * n * n;
                }
                
                numStr = "";
                
            } else if(c == '*') {
                scoreArr[idx-1] *= 2;
                if(idx-2>=0) scoreArr[idx-2]*=2; 
            } else if(c == '#') {
                scoreArr[idx-1] *= -1;
            }
        }  
        answer=scoreArr[0]+scoreArr[1]+scoreArr[2];
    
        return answer;
    }
    
}