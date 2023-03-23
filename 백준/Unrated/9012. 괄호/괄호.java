import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String currentPs = br.readLine();
            int psLength = currentPs.length();
            
            for (int j = 0; j < psLength; j++) {
                char currentP =  currentPs.charAt(j);
                
                if (currentP == '('){
                    stack.push(currentP);
                }
                else {
                    if(stack.isEmpty()) {
                        stack.push(currentP);
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            stack.clear();
        }
    }
}