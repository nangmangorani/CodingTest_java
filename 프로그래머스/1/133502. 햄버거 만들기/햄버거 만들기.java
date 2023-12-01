import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<ingredient.length; i++) {
            list.add(ingredient[i]);
        }
        
        for(int i =0; i<list.size()-3; i++) {
            if(list.get(i) == 1 && list.get(i+1) == 2 && list.get(i+2)==3 && list.get(i+3)==1) {
                answer++;
                for(int j = i; j<=i+3; j++) {
                    list.remove(i);
                }
                if(i<=2) {
                    i = -1;
                } else {
                    i = i-4;
                }
            }
        }
        return answer;
        
    }
}