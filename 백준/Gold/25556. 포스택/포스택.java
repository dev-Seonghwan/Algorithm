import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

    static String solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] permutation = new int[n];
        int idx = 0;
        while(st.hasMoreTokens()) {
            permutation[idx++] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer>[] stacks = new Stack[4];
        for(int i = 0; i<4; i++){
            stacks[i] = new Stack();
        }

        for (int i = 0; i < n; i++) {
            boolean hasPushed = false;
            for(int j = 0; j<4; j++){
                if (stacks[j].isEmpty()) {
                    hasPushed = true;
                    stacks[j].push(permutation[i]);
                    break;
                }
                if (stacks[j].peek() < permutation[i] ) {
                    hasPushed = true;
                    stacks[j].push(permutation[i]);
                    break;
                }
            }
            if (!hasPushed) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) throws Exception {
        System.out.println(solution());
    }

}