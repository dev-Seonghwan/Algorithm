class Solution {
    public String[] solution(String[] quiz) {

        String[] answer = new String[quiz.length];
        String plus = "+";

        for (int i = 0; i < quiz.length; i++) {
            String[] splitString = quiz[i].split(" ");
            if (splitString[1].equals(plus)) {
                int plusResult = Integer.parseInt(splitString[0]) + Integer.parseInt(splitString[2]);
                if (plusResult == Integer.parseInt(splitString[4])) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            } else {
                int minusResult = Integer.parseInt(splitString[0]) - Integer.parseInt(splitString[2]);
                if (minusResult == Integer.parseInt(splitString[4])) {
                    answer[i] = "O";
                } else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}