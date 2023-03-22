import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main {

    static int solution() throws Exception {
        int answer = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        LinkedList<Integer> queue = new LinkedList<>();

        // 10 3
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] targetIndex = new int[st.countTokens()];
        int stSize = st.countTokens();
        for (int i = 0; i < stSize; i++) {
            targetIndex[i] = Integer.parseInt(st.nextToken());
        }

        //2 9 5
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        for (int i = 0; i < m; i++) {
            if (queue.indexOf(targetIndex[i]) > queue.size() / 2) {
                while (targetIndex[i] != queue.getFirst()) {
                    queue.addFirst(queue.removeLast());
                    answer++;
                }
            }
            else {
                while (targetIndex[i] != queue.getFirst()) {
                    queue.addLast(queue.removeFirst());
                    answer++;
                }
            }
            queue.removeFirst();
        }

        return answer;

    }


    public static void main(String[] args) throws Exception {
        System.out.println(solution());
    }
}