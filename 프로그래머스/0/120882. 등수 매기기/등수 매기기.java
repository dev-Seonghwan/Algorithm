class Solution {
    public int[] solution(int[][] score) {

        double[] avg = new double[score.length];
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            avg[i] = (double)( score[i][0] + score[i][1] ) / 2;
        }

        for (int i = 0; i < avg.length; i++) {
            int rank = 1;

            for (double j : avg) {
                if (avg[i] < j) {
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
    }
}