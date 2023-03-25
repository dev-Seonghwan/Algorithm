import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long answer = 0;

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int[] binaryDigits = new int[20];

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < n; j++) {
                if ( (numbers[j]&(1<<i))!=0) {
                    binaryDigits[i]++;
                }
            }
        }

        for (int i = 0; i < 20; i++) {
            answer += (1L<<i)*binaryDigits[i]*(n-binaryDigits[i]);
        }

        System.out.println(answer);


    }
}
