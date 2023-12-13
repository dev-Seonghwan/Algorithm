class Solution {
   public int solution(String[] arr) {
    int n = arr.length;
    int[] numbers = new int[(n + 1) / 2];
    char[] operators = new char[n / 2];

    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) {
            numbers[i / 2] = Integer.parseInt(arr[i]);
        } else {
            operators[i / 2] = arr[i].charAt(0);
        }
    }

    int[][] min = new int[numbers.length][numbers.length];
    int[][] max = new int[numbers.length][numbers.length];

    for (int i = 0; i < numbers.length; i++) {
        min[i][i] = max[i][i] = numbers[i];
    }

    for (int len = 1; len < numbers.length; len++) {
        for (int i = 0; i < numbers.length - len; i++) {
            int j = i + len;
            min[i][j] = Integer.MAX_VALUE;
            max[i][j] = Integer.MIN_VALUE;

            for (int k = i; k < j; k++) {
                int a = evaluate(min[i][k], operators[k], min[k + 1][j]);
                int b = evaluate(max[i][k], operators[k], max[k + 1][j]);
                int c = evaluate(min[i][k], operators[k], max[k + 1][j]);
                int d = evaluate(max[i][k], operators[k], min[k + 1][j]);

                min[i][j] = Math.min(min[i][j], Math.min(a, Math.min(b, Math.min(c, d))));
                max[i][j] = Math.max(max[i][j], Math.max(a, Math.max(b, Math.max(c, d))));
            }
        }
    }

    return max[0][numbers.length - 1];
}

private int evaluate(int a, char operator, int b) {
    return (operator == '+') ? a + b : a - b;
}
}