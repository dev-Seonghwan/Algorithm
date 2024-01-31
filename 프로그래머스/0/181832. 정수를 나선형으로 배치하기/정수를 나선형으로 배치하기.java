class Solution {

    public static int[][] solution(int n) {

        int[][] answer = new int[n][n];

        int sideLength = n - 1;
        int currentNumber = 1;
        int beginPoint = 0;
        int endPoint = 0;

        while (currentNumber <= n * n) {

            for (int i = beginPoint; i < n - beginPoint; i++) {
                answer[beginPoint][i] = currentNumber++;
            }

            beginPoint++;

            // goDown
            for (int i = beginPoint; i < n - endPoint; i++) {
                answer[i][n - beginPoint] = currentNumber++;
            }

            // goLeft
            for (int i = sideLength - beginPoint; i >= endPoint; i--) {
                answer[n - beginPoint][i] = currentNumber++;
            }

            // goUp
            for (int i = sideLength - beginPoint; i > endPoint; i--) {
                answer[i][endPoint] = currentNumber++;
            }
            endPoint++;
        }
        return answer;
    }


}