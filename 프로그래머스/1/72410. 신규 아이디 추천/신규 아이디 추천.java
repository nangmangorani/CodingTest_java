class Solution {
    public String solution(String new_id) {
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        // toCharArray하고 for문으로 알파벳, -,.일때만 StringBuilder에 추가
        char[] idArr = new_id.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < idArr.length; i++) {
            if ((idArr[i] >= 'a' && idArr[i] <= 'z') || idArr[i] == '-' || idArr[i] == '_' || idArr[i] == '.' || idArr[i] >= 48 && idArr[i] <= 57) {
                sb.append(idArr[i]);
            }
        }
        
        // 3단계
        if (sb.length() > 0) {
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i - 1) == '.' && sb.charAt(i) == '.') {
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }

        // 4단계
        if (sb.length() > 0 && sb.charAt(0) == '.') {
            sb.deleteCharAt(0);
        }

        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
            sb.deleteCharAt(sb.length() - 1);
        }

        // 5단계
        if (sb.length() == 0) {
            sb.append("a");
        }

        // 6단계
        if (sb.length() >= 16) {
            sb = new StringBuilder(sb.substring(0, 15));
            
            // 새로 만든 StringBuilder에 대한 처리를 추가해야 함
            if (sb.charAt(sb.length() - 1) == '.') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        // 7단계
        if (sb.length() <= 2) {
            while (sb.length() < 3) {
                sb.append(sb.charAt(sb.length() - 1));
            }
        }

        return sb.toString();
    }
}