class Solution {
    public int solution(String s) {
        char first = s.charAt(0);
		int firstNum = 0;
		int diffNum = 0;
		int answer = 0;
        
		for (int i = 0; i < s.length(); i++) {
			if (firstNum == diffNum) {
				answer++;
				first = s.charAt(i);
			}
			if (s.charAt(i) == first) firstNum++;
			else diffNum++;
		}
		return answer;
    }
}