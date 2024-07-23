class Solution {
    public int solution(String my_string) {
        int result = 0; 
        for (char ch : my_string.toCharArray()) {
            if (Character.isDigit(ch)) { 
                result += Character.getNumericValue(ch); 
            }
        }
        return result; 
    }
}