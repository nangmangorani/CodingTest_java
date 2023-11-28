class Solution {
    public int solution(String s) {
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] str = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i <= 9; i++) {
            s = s.replace(str[i],num[i]);
        }
        return Integer.parseInt(s);
    }
}