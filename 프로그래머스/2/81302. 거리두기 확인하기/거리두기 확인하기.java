class Solution {
    private static final char PERSON = 'P';
    private static final char TABLE = 'O';
    private static final char PARTITION = 'X';
    
    private static final int[] dy = {1,-1,0,0};
    private static final int[] dx = {0,0,-1,1};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[5];
        
        for (int k = 0; k < 5; k++) {
            char[][] place = init(places, k);
            
            boolean flag = true;
            for (int y = 0; y < place.length && flag; y++) {
                for (int x = 0; x < place[0].length && flag; x++) {
                    if (place[y][x] == PERSON) {
                        flag = checkDistance(y, x, place);
                    }
                }
            }
            if (flag) {
                answer[k] = 1;
            }
        }
        return answer;
    }
    
    boolean checkDistance(int y, int x, char[][] place) {
        for (int path = 0; path < 4; path++) {
            int ny = y + dy[path];
            int nx = x + dx[path];
            
            if (ny == y && nx == x) continue;
            if (!isMovable(ny, nx, place)) continue;
            if (place[ny][nx] == PERSON) return false;
            
            for (int path2 = 0; path2 < 4; path2++) {
                int nny = ny + dy[path2];
                int nnx = nx + dx[path2];
                
                if (nny == y && nnx == x) continue;
                if (!isMovable(nny, nnx, place)) continue;
                if (place[nny][nnx] == PERSON) return false;
            }
        }
        return true;
    }
    
    boolean isMovable(int y, int x, char[][] place) {
        if (y < 0 || x < 0 || y >= place.length || x >= place[0].length || place[y][x] == PARTITION) return false;
        return true;
    }
    
    char[][] init(String[][] places, int k) {
        char[][] place = new char[places[k].length][places[k][0].length()];
        
        for (int i = 0; i < places[k].length; i++) {
            place[i] = places[k][i].toCharArray();
        }
        
        return place;
    }
}