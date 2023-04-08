import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while (left <= right){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int answer = s.length();

        for (int i = 0; i < s.length(); i++) {
            if(isPalindrome(s.substring(i))){
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}