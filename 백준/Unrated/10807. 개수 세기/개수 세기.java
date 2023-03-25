import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int findNum = Integer.parseInt(br.readLine());

        for (int number : numbers) {
            if (findNum == number) {
                answer++;
            }
        }
        System.out.println(answer);


    }
}
