import java.util.Arrays;
class Solution {
    public String solution(String s) {
        // 1. 띄어쓰기로 split해서 배열로 만들고 array.sort로 오름차순
        // 2. 결과 answer는 맨앞 + " " + 맨뒤
        
        String[] arr = s.split(" ");
        
        int[] values = Arrays.stream(arr)
                        .mapToInt(Integer::parseInt)
                        .toArray();
        Arrays.sort(values);
        String answer = values[0] + " " + values[values.length-1];
        return answer;
    }
}