class Solution {
    public int[] solution(String[] wallpaper) {
        
        int leastX = wallpaper[0].length();
        int leastY = wallpaper.length;
        int maxX = 0;
        int maxY = 0;
        
        for(int i = 0; i<wallpaper.length; i++) {
            for(int j = 0; j<wallpaper[0].length(); j++) {
                
                int nowX = j;
                int nowY = i;
                
                if(wallpaper[i].charAt(j)=='#') {
                    if(leastX > nowX) {
                    leastX = nowX;
                }
                
                if(leastY > nowY) {
                    leastY = nowY;
                }
                
                if(maxX<nowX) {
                    maxX = nowX;
                }
                
                if(maxY<nowY) {
                    maxY = nowY;
                }
                
            }
        }
    }
    return new int[]{leastY, leastX, maxY + 1, maxX + 1};
        
    }
}