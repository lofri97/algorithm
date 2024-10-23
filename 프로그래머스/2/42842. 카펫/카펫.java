class Solution {
    public int[] solution(int brown, int yellow) {
        
        for (int nw = 1; nw <= yellow; nw++) {
            int nh = yellow / nw;
            if (nh > nw || yellow % nw != 0) continue;
            if (nw * 2 + nh * 2 + 4 == brown) {
                return new int[] { nw + 2, nh + 2};
            }
        }
        return new int[] {};
    }
}

/**
노란색 가로 * 2 + 노란색 세로 * 2 + 4 = 갈색의 크기.
nw * 2 + nh * 2 + 4 = bc
nw * nh = nc

**/